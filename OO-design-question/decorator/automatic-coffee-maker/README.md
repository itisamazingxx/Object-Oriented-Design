### LintCode 3446 Automatic Coffee Maker

```Mermaid
classDiagram

class Coffee
<<interface>> Coffee
Coffee: +void getCost()
Coffee: +void getIngredients()

class SimpleCoffee
SimpleCoffee: +void getCost()
SimpleCoffee: +void getIngredients()

SimpleCoffee ..|> Coffee

class CoffeeDecorator
CoffeeDecorator: +void getCost()
CoffeeDecorator: +void getIngredients()

CoffeeDecorator ..|> Coffee

class WithMilk

WithMilk --|> CoffeeDecorator

class WithSugar

WithSugar --|> CoffeeDecorator

CoffeeDecorator o-- SimpleCoffee
```