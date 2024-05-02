# MySQL

1. 通过3306接口监听
2. 普通表的本质依然是文件

### 创建数据库
```MySQL
CREATE DATABASE `practice_01`;
CREATE DATABASE practice_02 CHARACTER SET utf8;
# 使用utf8字符集的数据库
```

显示创建的所有数据库
```MySQL
SHOW DATABASES;
```

### 删除数据库
```MySQL
DROP DATABASE practice_01;
```

### 创建表
1. CHARACTER SET 如不指定为所在数据库字符集
2. COLLECT 校对规则
3. ENGINE 存储引擎
```MySQL
CREATE TABLE table_01 (
	id	INT,
    `name` VARCHAR(255),
    `birthday` DATE
) character set utf8 COLLATE utf8_bin ENGINE INNODB;
```

### 插入数据
```MySQL
INSERT INTO table_01 VALUES (1, "Raymond", '2024-01-01');
```

### 修改数据
```MySQL
# 向表里添加新的Column
ALTER TABLE table_01
   ADD image VARCHAR(32) NOT NULL DEFAULT ''
      AFTER birthday;
# 修改表名
ALTER TABLE table_01 RENAME TO table_001;
# 修改表中某个Column的具体信息
ALTER TABLE table_001
   MODIFY name VARCHAR(60) NOT NULL DEFAULT '';
# 修改表中某个Column的列名
ALTER TABLE table_001
   CHANGE name user_name VARCHAR(60) NOT NULL DEFAULT '';
```

### mySQL数据类型
1. 整数: tinyint, smallint, mediumint, int, bigint
2. 小数: float/double, decimal[M, D] - decimal可以存放很大的数
3. 字符串:

    char(size) - 固定长度字符串

    varchar(size) - 可变长度字符串
4. 日期类型: (自动更新的日期timestamp), datetime

### MySQL的增删改查
1. Insert
   
   插入语句的字段应该与列中的数据类型相同
   排序/长度也需保持一致
   字符和日期型数据应包含在单引号中
```MySQL
INSERT INTO items (id, item_name, price)
	VALUES (3, "iphone3", 1899),
			(4, 'ipad', NULL);
```

2. Update
```MySQL
UPDATE items SET price = 5000; # 没有带WHERE会修改所有记录
UPDATE items SET price = 2000 WHERE item_name = 'iphone2';
# 更新多列信息
UPDATE items SET price = 2000, item_name = 'ipad4' WHERE id = 4;
```

3. Delete (只能删除Row, 不能删除Column)
```MySQL
DELETE FROM table_01 WHERE user_name = 'ariel';
```

4. Select
```MySQL
SELECT Name, (Salary * 12) AS AnnualSalary From Employees;
SELECT * FROM Student WHERE Math > 60 AND id > 4;
SELECT * FROM Student WHERE Math IN (89, 90, 91);
```

### Other Operations
1. Order By (排序方式)
```MySQL
SELECT * FROM Employees ORDER BY EmployeeID;
```
2. Count/Sum/Max/Min

   COUNT(列) - 统计满足条件的某列有多少个, 但是会排除null
```MySQL
SELECT COUNT(*) FROM Employees;
# 返回满足条件的记录的总行数
```
3. Having
```MySQL
SELECT AVG(sal), depno AS avg_sal, depno 
    FROM Employee GROUP BY depno
        HAVING avg_sal < 2000;
```

### unique
```MySQL
CREATE TABLE table_01 (
	id	INT UNIQUE,
    `name` VARCHAR(255) UNIQUE,
    `birthday` DATE
)
```

### Foreign Key (外键)
1. 如果要把某一列做成其他表的外键, 则此列必须是本表的Primary Key
2. 一旦建立主外键关系, 表就不能随意删除
```MySQL
CREATE TABLE myClass (
	id INT PRIMARY KEY,
    name VARCHAR(32),
    address VARCHAR(60)
);

CREATE TABLE myStudent (
	id INT,
    name VARCHAR(32),
    class_id INT,
    FOREIGN KEY (class_id) REFERENCES myClass(id)
);
```

### 自增长
1. 实现了自增长后就可以默认不声明这一列
2. 自增长一般和主键同时使用, 如果不用primary key则要跟unique一起
3. 搭配整型
4. 默认从1开始
```MySQL
CREATE TABLE goods (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(64) NOT NULL DEFAULT "",
    email VARCHAR(64)
);

INSERT INTO goods
VALUES(NULL, 'Norway', 'awosome@txl.com');

INSERT INTO goods
   (name, email) VALUES ('Herlin', 'Mixser@dot.com');
```

### 索引
1. 没有索引, 默认是全表扫描
2. 主键索引, 主键自动的为主索引(primary key)
3. 唯一索引(unique)
4. 较频繁的作为查询条件的字段可以作为索引
5. 唯一性太差的字段不适合单独创建索引 (性别)
6. 更新非常频繁的字段不适合创建索引 (login次数)
```MySQL
# 查询表是否有索引
SHOW INDEXES FROM table_01;
# 添加唯一索引
CREATE UNIQUE INDEX id_index ON table_01 (id);
# 添加主键索引
ALTER TABLE table_01 ADD PRIMARY KEY (id);
# 删除索引
DROP INDEX id_index ON table_01;
# 删除主键索引
ALTER TABLE table_01 DROP PRIMARY KEY;
```

### MySQL事务
1. 事务用于保障数据的一致性, 是由一组相关的dml(update, insert, delete)组成
2. 事务要么全部成功, 要么全部失败 (转账)
3. 当执行事务操作时(这组dml语句), MySQL会在表上加锁, 防止其他用户更改表的数据
4. MySQL数据库控制台事务的几个重要操作
   
   start transaction 开始事务
   
   savepoint 设置保存点

   rollback to 回退事务 (直接写rollback表示回退到事务开始的状态)

   commit 提交事务 (所有的操作生效 不能回退)
   当使用commit结束事务后, 其他会话, 其他连接将可以查看到事务变化后的新数据

```MySQL
CREATE TABLE shopping_cart (
    item_id INT PRIMARY KEY AUTO_INCREMENT,
    quantity INT NOT NULL
);

-- 开始一个新的事务
START TRANSACTION;

-- 设置一个保存点 savepoint1
SAVEPOINT savepoint1;
INSERT INTO shopping_cart (quantity) VALUES (3);

-- 再次设置一个保存点 savepoint2
SAVEPOINT savepoint2;
-- 添加另一个商品，假设这是一个无意的操作
INSERT INTO shopping_cart (quantity) VALUES (5);

-- 我们意识到上一个操作是一个错误，回滚到 savepoint2
ROLLBACK TO savepoint2;

-- 事务进行中，我们添加另外一些商品
INSERT INTO shopping_cart (quantity) VALUES (2);
SELECT * FROM shopping_cart; # 最后只有3, 2
```
**Note:**
1. 如果不开启事务 默认dml自动提交不能回滚
2. 如果开启事务不设置保存点 默认回归到事务最开始时

### 事务的隔离级别

1. 一个设备在修改数据时, 另一个设备试图访问数据库, 看到的是怎样的数据?
2. 多个连接(设备)开启各自事务操作数据库的时候, 数据库系统主要负责隔离操作,
以保证各个连接在获取数据时的准确性
3. Dirty Read: 当一个事务读取到另一个事务尚未提交的修改
4. Non-repeatable Read: 同一查询在同一事务中多次进行

四种隔离级别
1. read uncommitted
2. read committed
3. repeatable read
4. serializable

### MySQL Engine
1. MySQL的表类型由存储引擎决定
2. 数据表主要支持6种类型, CSV..InnoDB
3. 这六种分为事务安全型和非事务安全型