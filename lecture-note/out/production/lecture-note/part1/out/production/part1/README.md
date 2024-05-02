## OverLoad 方法重载

Java允许同一个类中，有多个同名方法存在 (!!!但要求形参列表不一致)
1. 方法名必须相同(不重名不算重载)
2. 形参列表/顺序必须不同
3. 对返回类型没有要求

## 可变参数

Java允许同一个类中将多个同名同功能但参数个数不同的方法，封装成一个方法
1. 可变参数传入的实参可以是一个数组
2. 可变参数可以和普通类型的参数一起放在形参列表，但必须保证可变参数在最后
3. 一个形参列表中**只能**出现一个可变参数

```java
public int sum(int... nums) {
    ...
}
```

## 变量的作用域
1. 在Java中, 变量主要分为: 属性(成员变量); 局部变量
2. 局部变量一般指在成员方法(或代码块)中定义的变量
3. 定义的变量只能在离自己最近的大括号内使用(也就是其作用域)
4. 属性(成员变量)如果不赋值, 有默认值
5. 属性和局部变量可以重名, 访问时遵循就近原则
6. 同一个作用域中, 变量不能重名
7. 属性的生命周期比较长, 伴随着对象的创建而创建, 伴随着对象的销毁二销毁
8. 局部变量生命周期较短, 伴随着执行它的代码块而创建, 代码块结束即销毁, 即在一次方法的调用过程中

## Constructor
1. 构造器是完成对象的初始化(不是创建对象)
2. 没有返回值
3. 当创建对象的时候(new一个新对象), 系统自动调用构造器
4. 如果没有设置任何构造器, 系统会自动给类生成一个无参构造器(默认构造器), 一旦定义了自己的构造器, 原先的构造器就被覆盖了

## this
1. Java虚拟机会给每个对象创建this, 代表**当前**对象
2. this (指向对象本身的地址)
3. 哪个对象调用, this就代表哪个对象

### Encapsulation

Encapsulation is the process of combining data (attributes) and data manipulation methods into a single unit known as a class. Data inside the class is protected, and external access to this data is only possible through authorized operations.

**Advantages:**
- Conceals the implementation details.

**Steps to Achieve Encapsulation:**
1. **Private Attributes:**
   - Make attributes private to prevent direct access to the class's internal data.

2. **Public Getters/Setters:**
   - Provide public getter and setter methods to access and update the value of private attributes. You can incorporate business logic for data validation within these methods, illustrating an example of encapsulation.

## Inheritant
1. 当多个类存在相同的属性(变量), 和方法的时候, 可以从其中抽象出父类, 提高代码的复用性(这是继承的主要功能)
2. 父类中已经定义的属性和方法, 子类不需要再定义就可以直接使用
3. 子类继承了父类所有的属性和方法, 但私有属性不能在子类直接访问, 要通过公共方法访问
4. 子类创建的时候, 父类的无参构造器自动被调用 (如果父类没有提供无参构造器, 则必须在子类的构造器中用super去指定)
5. 子类最多只能继承一个父类(Java中是单继承模式), 要满足is-a关系
6. 子类在堆中被分配的内存包含父类的属性(内存分布图)

## Super
1. 用来访问父类的构造器, super(参数列表)只能放在构造器的第一句

## Override 重写/覆盖
1. 子类的一个方法, 和父类的某个方法的名称/返回类型/参数一样, 那么我们就说子类的这个方法覆盖了父类的方法
2. 以下例子也构成重写, 因为String是Object的一个子类(重写的返回类型必须相同or是原返回值的其子类)
```Java
class Base {
    public Object hi() {
        return null;
    }
}

class Layer01 extends Base {
    @Override
    public String hi() {
        return null;
    }
}
```
3. 子类方法的重写不能缩小父类的访问权限(public > protective > 默认 > private)

## Compare OverLoad & Override
1. overload在同一个类中有多个重名方法(形参不同, 返回值也可以不同, 对修饰符无要求)
2. override发生在继承中(形参列表必须相同), 只能返回父类同名方法的相同返回值(或其子类)

## Polymorphism
1. 方法或对象具有多种形态
2. 多态是建立在封装和继承基础之上的, 面向对象的第三大特征
3. 方法重载(OverLoad)就是多态的一个体现, (传入不同的参数调用的是不同的方法)
4. Override(重写), 会自己定位父类子类中具体的方法, 也体现多态

### 对象的多态
1. 对象的多态是多态的核心
2. 一个对象的编译类型和运行类型可以不一致
```Java
Animal dog = new Dog();
// Animal是编译类型
// Dog是运行类型 (运行类型看堆里指向的对象)
// 可以把一个子类对象赋给一个父类的对象引用
```
3. 编译类型在定义对象的时候就确定了, 不可以更改
4. 运行类型是可以变化的 (体现多态)
5. 编译类型看定义时 = 的左边, 运行类型看 = 的右边
6. 多态的前提是两个类存在继承关系
7. 属性没有重写之说 属性的值取决于对象的编译类型
8. 方法的调用看实际的**运行类型**

### 多态的向上转型
1. 本质: 父类的引用指向了子类的对象
2. 语法: 父类类型引用名 = new 子类类型()
3. 在编译阶段能使用哪些属性和方法是由编译类型决定的, 但调用方法时, 从运行类型开始调用

### 多态的向下转型
1. 语法: 子类类型 引用名 = (子类类型) 父类引用
```Java
Cat cat = (Cat) animal;
```
2. 只能强转父类的引用 不能转换父类的对象
3. 要求父类的引用必须指向的是当前目标类型的对象
4. 可以调用子类类型中的所有成员

### Java的动态绑定机制
1. 当调用对象方法的时候, 该方法会和该对象的内存地址/运行类型绑定
2. 当调用对象属性的时候, 没有动态绑定机制, 哪里声明哪里使用(看编译类型)

### 多态数组
1. 只要不同子类都继承同一父类, 那么数组中也可以添加不同子类的对象 (部分消除了数组只能保存同一类型数据的限制)

### 多态参数
1. 方法定义的形参类型为父类类型，实参类型允许为子类类型

## Object
1. Object是Java中所有对象的超类, 所有对象都实现这个类中的方法
2. getClass() - 返回该对象的运行类型
3. hashCode() - 返回该对象的哈希码值
4. equals()
5. finalize()
6. toString()

### equals()
**== 和 equals() 有什么区别?**
1. ==是一个比较运算符, 可以用来判断基本类型是否相等, 也可以用来判断引用类型是否相等
2. 如果是比较的是基本类型, 判断的是值是否相等
3. 如果比较的是引用类型, 则比较的是其地址是否相同(即判定是否为同一个对象)
4. equals()是Object类下的一个方法, 只能判断引用类型

### hashCode()
1. 两个引用如果指的是同一个对象, 则其hashCode是一样的
2. 两个引用指向不同的对象, hashCode不一样
3. 哈希值主要是根据地址来计算的, 但不能将哈希值等价为地址

### toString()
1. 默认返回: 全类名+@

 ## Interface
 
 ### Interface V.S Inheritant
 1. 当子类继承父类，自动拥有父类的功能
 2. 如果子类需要扩展功能 可以通过实现接口的方式扩展
 3. 实现接口是对Java单继承机制的一种补充

 接口和继承解决的问题是不同的：
 1. 继承的价值主要在于：解决代码的复用性和可维护性
 2. 接口的价值在于：设计，设计好各种规范(方法)，让其他类实现这些方法