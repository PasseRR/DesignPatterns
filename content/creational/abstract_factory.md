## 抽象工厂模式
提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。  
创建新对象的方法，但是返回的是接口或者抽象类。

### JDK中的使用
- java.util.ResourceBundle#getBundle(java.lang.String)
- java.sql.Connection#createStatement()
- java.util.Calendar#getInstance()

### 实现
