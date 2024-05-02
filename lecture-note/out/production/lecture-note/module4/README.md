### Recursive Structure

 Have a class defination that has a instance itself
 as a member, we call that recursive struture

 存储的是reference

 ### Property of Linked List

 > powerful when we store chain of information

 1. To access every elelment of the whole list, we only need
 to save the reference of the first node in this list
 2. Each node has an implicit position in the list
 3. Remove/Add node from a list

### Supported Operations

1. Counting the number of books in the list
2. Calculating the total cost of the collection
3. Printing out all books in the collection
4. Finding what collectible I have in my collection
5. Sort list by price

注意链表的插入顺序

当我们想要implement一个feature (method), 例如example里的sortByPrice,
首先define sortByPrice, 思考这个method如何实现, then 一直follow到book class

### Abstract Out for Predicting

```java
IListOfBooks lastCentury = listOfBooks.getList(new BookBefore(2000));
```

我们只需要根据user想要filter的内容持续往current list上叠加就好了
这样开发新feature只需要往上叠加一个module (多implement一个class)

### Predict Interface

> Predict<T>

## String
String如果直接赋值常量, 结果储存在常量池中
如果new String创建, 结果储存在堆中

String是一个final类，代表不可变的字符序列。
字符串是不可变的，一个字符串对象一旦被分配，其内容是不可变的
练习题：
String s1 = "hello" + "abc" 一共创建了几个对象？
编译器会优化等价创建一个字符串对象”helloabc“
练习题
String a = "hello"
String b = "abc"
String c = a + b 一共创建了几个对象呢？
三个 c是用StringBuilder新创建的 最后指向堆
a, b指向常量池

字符串两个常量相加，最后是在常量池中
字符串两个变量相加，最后在堆中
