## Command Pattern

把请求封装成一个对象，命令模式必须是可以撤销的


```
classDiagram
class Command
<<interface>> Command
Command: +void execute()
Command: +void undo()
```