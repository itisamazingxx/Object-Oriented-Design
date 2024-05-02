```Mermaid

classDiagram

class Duck
<<abstract>> Duck
Duck: +void quark()
Duck: +void fly()

class PekingDuck

PekingDuck --|> Duck

class WildDuck

WildDuck --|> Duck

class ToyDuck

ToyDuck --|> Duck

class FlyBehavior
<<interface>> FlyBehavior
FlyBehavior: +void fly()

class NoFlyBehavior

class BadFlyBehavior

class GoodFlyBehavior

NoFlyBehavior ..|> FlyBehavior
BadFlyBehavior ..|> FlyBehavior
GoodFlyBehavior ..|> FlyBehavior

Duck o-- FlyBehavior

```

## Strategy Design Pattern 
定义算法族，分别封装起来，使其之间可以互相替换
此模式让算法的变化独立于使用算法的客户
针对接口编程