# Design Pattern

## 7 Principles of Design Patttern

1. 单一职责：每一个类只应该负责**一项**职责

    降低类的复杂度/ 变更带来的风险
```java
class Vehicle {
    public void roadRun() {
        // ...print
    }
    public void WaterRun() {
        // ...print
    }
    public void AirRun() {
        // ...print
    }
}
```

2. **Interface Segregation Principle** 接口隔离原则
```mermaid
class Interface1
<<Interface>> Interface1
Interface1: +void operation1()

class Interface2
<<Interface>> Interface2
Interface2: +void operation2()
Interface2: +void operation3()

class Interface3
<<Interface>> Interface3
Interface3: +void operation4()
Interface3: +void operation5()

class A 

A ..|> Interface1
A ..|> Interface2

class B
B ..|> Interface1
B ..|> Interface3

class C 
C: +depend1(Interface1 i)
C: +depend2(Interface2 i)
C: +depend3(Interface2 i)

C ..> Interface1
C ..> Interface2

class D
D: +depend1(Interface1 i)
D: +depend4(Interface3 i)
D: +depend5(Interface3 i)

D ..> Interface1
D ..> Interface3
```
```java

```