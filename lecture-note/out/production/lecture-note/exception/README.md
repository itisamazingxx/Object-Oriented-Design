## Exception

### 为什么要用到exception:
1. 使程序遇到错误问题不至于崩溃 (更强大的健壮性)
2. 如果觉得一段代码可能出现问题, 用try-catch解决, 提高代码容错性

Raising Exceptions

An exception occurs when something unexpected happens, whether it be invalid input,
an operation that cannot be completed (e.g. the square root of a negative number) 
or even something that is beyond our control (e.g. attempting to read from a file 
that no longer exists). Exceptions offer us a dignified way of aborting a method and 
sending a message to its caller that something went wrong.

错误分为两类：
1. Error (JVM无法解决的错误) - StackOverFlow (程序必须崩溃)
2. Exception 一般性问题 (空指针访问，试图读取不存在的文件，网络连接中断)

Exception分为两类：
1. 编译器无法检查的逻辑错误(运行时异常)
2. 编译时异常

### 运行时异常
常见的运行时异常(RunTimeException):
1. 空指针异常
2. 数学运算异常
3. 数组下标越界异常
4. 类型转换异常 ClassCastException
5. 数字格式不正确异常 NumberFormatException

### 编译时异常
在编译期间就必须解决的异常，否则代码无法通过编译(FileNotFoundException)

异常处理：
1. try catch finally
2. throws

## Throws
1. 如果一个方法中可能生成某种异常，但并不能确定如何处理这些异常，则应该在方法声明中显式抛出异常
表示该方法不对这些异常进行处理（由方法的调用者负责处理，但也可以不处理，继续抛到JVM为止）
2. try-catch-finally和throws一般二选一
3. throws(异常处理的一种方式), 用在方法声明处
4. throw 手动生成异常对象的关键字, 在方法体内

