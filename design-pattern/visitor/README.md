classDiagram

class Action
Action: +void operation1()
Action: +void operation2()

class Success

Success --|> Action

class Fail

Fail --|> Action

class Person
Person: void accept(Action action)

Person ..> Action

class Man

Man --|> Person

class Woman

Woman --|> Person

class Woman

class ObjectStructure
ObjectStructure: elements() Person


ObjectStructure o-- Person