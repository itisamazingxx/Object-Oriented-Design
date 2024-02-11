### Method with Objects as arguments

see method example

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