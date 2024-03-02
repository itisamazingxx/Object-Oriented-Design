
```sql
CREATE TABLE short_urls (
    id INT AUTO_INCREMENT PRIMARY KEY,
    short_url VARCHAR(255) NOT NULL UNIQUE,
    original_url VARCHAR(2048) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```
![SQL Table Example](https://github.com/itisamazingxx/Object-Oriented-Design/blob/19f285dc0aea5a722599e862d8547ac15959fd6b/tiny-url/jpg/SQL-table-example.jpg)

### How to transfer long url to short url?
1. Random Generation + Database Deduplication (随机生成 + 数据库去重)
   Randomly generate a 6-character URL and check the database to see if it has been used before.
   If not, store it corresponding to the long URL.

**How are the 6-character URLs randomly generated?**

Generating a random 6-character short URL typically involves both uppercase and lowercase letters and 
numbers, making up a total of 62 characters (26 lowercase letters + 26 uppercase letters + 10 numbers).