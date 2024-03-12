
### Command Line
```
javac factory/simplefactory/order/*.java factory/simplefactory/pizza/*.java
java factory/simplefactory/order/PizzaStore
```

```mermaid
classDiagram
class Pizza
Pizza: +void prepare()
Pizza: +void bake()
Pizza: +void cut()
Pizza: +void box()

class GreekPizz

GreekPizz --|>  Pizza

class CheesePizz

CheesePizz --|> Pizza
```