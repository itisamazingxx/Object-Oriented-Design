## 集合

在 Java 集合框架中，List 接口的实现类（如ArrayList, LinkedList等）提供了操作列表元素的方法，例如添加、移除、获取元素

1. 可以动态保存多个对象 
2. 集合主要是两组(单列集合，双列集合)
3. Collection接口的两个重要接口List, Set, 是实现了单列集合
4. Map接口实现的子类是双列集合 存放K-V键值对

## Iterator
1. 所有实现了Collection接口的都会有一个.iterator()方法

## List
1. list集合元素是有序的(即添加顺序和取出顺序一致)

## Set
1. 无序(添加和取出的顺序不一致), 没有索引
2. 不允许重复元素 最多包含一个null
3. 取出的顺序虽然不是添加的顺序 但顺序是固定的
4. HashSet底层是HashMap

Set接口也是Collection的子接口