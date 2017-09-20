## 原型模式
用原型实例指定创建对象的种类，并且通过拷贝这个原型来创建新的对象。

### JDK中的使用
- java.lang.Cloneable
- java.lang.Object#clone()

### 代码实现
```java
@Data
public class CopyType implements Serializable {
    private String type;
}
```
1. 浅拷贝  
被拷贝对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来的对象。换言之，浅拷贝仅仅拷贝所考虑的对象，而不拷贝它所引用的对象。
```java
@Data
public class ShallowCopy implements Cloneable {
    private String name;
    private CopyType copyType;
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
```
2. 深拷贝  
被拷贝对象的所有变量都含有与原来的对象相同的值，除去那些引用其他对象的变量。那些引用其他对象的变量将指向被拷贝过的新对象，而不再是原有的那些被引用的对象。换言之，深拷贝把要拷贝的对象所引用的对象都拷贝了一遍。
```java
@Data
public class DeepCopy implements Serializable {
    private String name;
    private CopyType copyType;
    public Object clone(){
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);

            return objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            return null;
        }
    }
}
```