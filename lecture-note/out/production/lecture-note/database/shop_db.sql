# 商店售货系统表设计
# 声明每个表的主外键
CREATE TABLE customer (
      customer_id CHAR(8) PRIMARY KEY,
      name VARCHAR(64) NOT NULL DEFAULT "",
      address VARCHAR(64) NOT NULL DEFAULT "",
      email VARCHAR(60) UNIQUE,
      sex ENUM('MALE', 'FEMALE') NOT NULL,
      card_id CHAR(18)
);

CREATE TABLE goods (
       goods_id INT PRIMARY KEY,
       goods_name VARCHAR(64) NOT NULL DEFAULT "",
       unitprice DOUBLE NOT NULL DEFAULT 0
           CHECK (unitprice > 1.0 AND unitprice < 9999.99),
       category INT NOT NULL DEFAULT 0,
       provider VARCHAR(64)
);

CREATE TABLE purchase (
      order_id INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
      customer_id CHAR(8),
      goods_id INT,
      nums INT, -- 购买数量
      FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
      FOREIGN KEY (goods_id) REFERENCES goods(goods_id)
);
