## Template Method 模式

定义：在**父类中定义**处理流程的框架，在**子类中实现具体处理**。

优点：在父类的模板方法中编写了算法，而无需在子类中在编写。

例如本例中的 AbstractDisplay 抽象类中已写好 display() 方法，无需在子类中再次编写

### 父类与子类的一致性

在本例程序中，不论是 CharDisplay 的实例还是 StringDisplay 的实例，都是先保存在
AbstractDisplay 类型的变量中，然后再调用 display() 方法。

使用父类类型的变量保存子类实例（多态）的优点是：即使没有用 instanceof 等指定子类的种类，程序
也可以正常运行。

里氏替换原则：无论再父类类型的变量中保存哪个子类的实例，程序都可以正常工作。

### JDK 中的 Template Method 模式

1. java.io.InputStream 

read() 方法，被 InputStream 中的 read(byte[] b, int off, int len) 循环调用

