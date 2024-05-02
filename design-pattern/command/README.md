## Command Pattern
在软件开发中，有时候我们需要向某些对象发送请求，但不知道请求的接收者是谁
把请求封装成一个对象，命令模式必须是可以撤销的
命令模式可以消除发送者和接受者彼此之间的耦合
将军发布命令（不知道哪个士兵执行，只是发布命令，命令中有信息）
士兵（命令执行者）
命令（连接将军和士兵）


```
classDiagram
class Command
<<interface>> Command
Command: +void execute()
Command: +void undo()
```