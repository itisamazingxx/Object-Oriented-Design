## Lambda

Lambda是一个匿名函数, 可以将Lambda表达式理解为一段可以传递的代码
Lambda操作符 -> 箭头符
左边：Lambda形参课表
右边：Lambda体 (重写的抽象方法的方法体)
**Lambda表达式的本质**：作为函数式接口的实例

## 函数式接口

1. Converts a List of Strings into a list of reversed Strings ("Moon" -> "nooM")
2. Convert a List of numbers into a Map of each number to its squared version of this number
3. Given a map from City Names to State Names, create a list of city names that include the name of the
   state (think Virginia beach in Virginia or Kansas city in Kansas)
4. Converts a List of numbers into a list indicating the number of digits for each number respectively

# Stream API

1. 使用stream API对集合数据进行操作, 类似于SQL执行数据库查询
2. stream自己不存储数据
3. 不改变源对象, 返回一个持有新结果的stream

**Stream和Collection集合的区别:**
1. Collection是静态的内存数据
2. Stream是有关计算的

Stream的三个步骤
1. 创建Stream: 一个数据源(集合, 数组), 获取一个流
2. 中间操作: 中间操作链, 对数据源的数据进行处理
3. 一旦终止操作被执行, 执行中间操作并产生结果

创建Stream:
Java中的Collection接口被扩展, 提供了两个获取流的方法

## Stream的中间操作

1. 中间操作并不执行 (有终止操作中间操作才会执行)
2. 在Java中，Stream不能被重复使用。 一旦对一个流进行了终结操作(forEach)，这个流就被消耗掉了，不能再进行其他的流操作。
