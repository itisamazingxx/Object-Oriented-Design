## Template Method Pattern

imagine a scenario soy milk making:

选材 添加配料 浸泡 放到豆浆机打碎（对于每种豆浆模式都是一样的）

在一个抽象类中公开定义了方法的模板，子类重新override

template method 定义一个操作中算法的骨架 而将一些步骤延迟到子类中

```Mermaid
classDiagram

class SoyMilk
<<abstract>> SoyMilk
SoyMilk: +void make()
SoyMilk: +void select()
SoyMilk: +abstract void add()
SoyMilk: +void soak()
SoyMilk: +void beat()

class BlackBeanSoyMilk

class PeanutSoyMilk
```