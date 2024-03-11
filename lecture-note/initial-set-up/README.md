## The Execution of Java

command line
```
javac Test.java
java Test
```
javac compile to "Test.class" file, 
计算机编译的文件是"Test.class" (本质是将这个class file放在JVM虚拟机里执行)


## Property of Java
1. Java语言是跨平台的 (Compile后的Test.class) 可以在Windows & Linux运行

### What's the difference between interpreted languages and compiled languages？
1. Compiled languages are compiled into machine code that can be **directly** executed by the computer's CPU.
(编译型语言编译后可以被计算机直接运行)
2. Interpreted languages are not directly executed by the computer's CPU

## The structure of Java file
```java
public class Hello {
    public static void main(String[] args) {
        System.println("Hello World");
    }
}

class Dog {
// Constructor .. 
}

class Cat {
    // Constructor .. 
}
```
一个Java file里至多只能有一个源文件，其他类的个数不限

编译后每一个类都对应一个.class文件

如果源文件包含一个public类，则文件名必须按该类名命名

## Javadoc
注释内容可以被JDK提供的工具所解析，生成一套以网页形式体现的该程序的说明文档

代码整体向左缩进 shift+tab
代码整体向右缩进 tab

## Relative paths & absolute paths 相对路径 & 绝对路径
An **absolute path** is a complete path that starts from the root directory of the filesystem.

(从root目录开始定位，形成的路径)

A **relative path** is a path that is relative to the current working directory. 

(从当前目录开始定位，形成的一个路径)

## Java Operations

### Arithmetic Operator 算数运算符
1. 取模的本质(%): a % b = a - a / b * b
2. 如果作为独立语句使用：i++/++i完全一样
3. 如果作为表达式
```java
int j = 8;
int k = ++j; // 等于j = j + 1; k = j; k j结果都是9

int j = 8;
int k = j++; // 等于k = j, j = j + 1; 结果k 8  j 9
```
```java
int i = 1;
i = i++; // i = 1

int i = 1;
i = ++i; // i = 2
```
过程都是使用临时变量：

temp = i

i = i + 1

i = temp

以及

i = i + 1

temp = i

i = temp

### Logical Operator 逻辑运算符

1. 对于短路与&&而言，如果第一个条件为false，后面的条件不再判断(短路或||一样)

    对于逻辑与&而言，如果第一个条件为false，后面的条件仍然会判断


2. a^b, 当a, b不同的时候，结果为true, 否则为false

```java
int x = 5;
int y = 5;
if (x++ == 6 & ++y == 6) {
    x = 11;
} // x = 6, y = 6

```
```java
int x = 5;
int y = 5;
if (x++ == 6 && ++y == 6) {
    x = 11;
} // x = 6, y = 5
```
```java
int x = 5;
int y = 5;
if (x++ == 5 | ++y == 5) {
    x = 11;
} // x = 11, y = 6
```
```java
int x = 5;
int y = 5;
if (x++ == 5 || ++y == 5) {
    x = 11; 
} // x = 11, y = 5
```

### Ternary Operator 三元运算符
```java
int val1 = 55;
int val2 = 23;
int val3 = 44;

int max1 = val1 > val2 ? val1 : val2;
int max2 = max1 > val3 ? max1 : val3;
```
