## Class & Object
class: 抽象的 概念的 是一种数据类型

object: 对象是具体的 实际的 代表一个具体事务 实例

### Java内存结构分析
1. 栈：一般存放基本数据类型（局部变量）
2. 堆：存放对象
3. 方法区（常量池）：常量/字符串/类加载信息

### Method with Objects as arguments

成员方法传参机制：
1. 基本数据类型，传递的是值copy，形参的任何改变不影响实参
2. 引用数据类型传递的是地址，可以通过形参影响实参

### Raising Exceptions

An exception occurs when something unexpected happens, whether it be invalid input,
an operation that cannot be completed (e.g. the square root of a negative number) 
or even something that is beyond our control (e.g. attempting to read from a file 
that no longer exists). Exceptions offer us a dignified way of aborting a method and 
sending a message to its caller that something went wrong.

### Prepresenting Data that have finite, specific values

**enum**

Enumeration: Any data that can take a prescribed set of values is a good candidate 
for enumeration.

- switch case 用法
```java
switch (bookType) {
      case PAPERBACK:
        str = str + "Paperback";
        break;
      case HARDCOVER:
        str = str + "Hard Cover";
        break;
      case KINDLE:
        str = str + "Kindle";
        break;
    }
```