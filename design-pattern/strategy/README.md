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