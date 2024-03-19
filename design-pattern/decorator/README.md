## 装饰者模式

Imagine a snorio, we are operating a Starbucks coffee shop, customer may have bunch of options to combine their drink,

We could abtract a drink interface and let each one of the combination implement the interface, but that may too complicated and worrden 

when the total combination num increase (like what if we want a matcha with cream, latte with oatmilk/almond milk?)

隶属于结构型模式

(动态的) 向一个现有的对象添加新的功能，同时又不改变其结构。ocp原则

不管是什么形式 有个base coffee，用milk，chocolate包裹coffee (包裹再包裹 是通过递归方式维护组合)

可扩展性非常高

## Command

```
javac coffee/*.java topping/*.java *.java
java CoffeeBar
```

