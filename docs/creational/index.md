# 创建型模式

> 创建模式是对类的实例化过程的抽象化。在一些系统里，可能需要动态的决定怎样创建对象，  
> 创建哪些对象，以及如何组合和表示这些对象。创建模式描述了怎么构造和封装这些动态的决定。  
> 创建模式分为类的创建模式和对象的创建模式两种。

- 类的创建模式 类的创建模式使用继承关系，把类的创建延迟到子类，  
  从而封装了客户端将得到哪些具体类的信息，并且影藏了这些类的实例是如何被创建和放在一起的。
- 对象的创建模式 对象的创建模式描述的是把对象的创建过程动态地委派给另外一个对象，  
  从而动态地决定客户端讲得到哪些具体的类的实例，以及这些类的实例是如何被创建和组合在一起的。

创建型模式包括：单例、原型、抽象工厂、工厂方法、构造器共5种模式。