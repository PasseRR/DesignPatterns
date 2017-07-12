package passerr.github.io.creational.prototype;

import lombok.Data;

import java.io.*;

/**
 * 深拷贝<BR/>
 * <P>
 * 利用串行化来做深复制,把对象写道流里的过程是串行化(Serialization)过程;
 * 把对象从流中读出来是并行化(Deserialization)过程,写在流里的是对象的一个拷贝,然后再从流里读出来重建对象.
 * </P>
 * @author xiehai1
 * @date 2017/07/12 21:08
 * @Copyright(c) gome inc Gome Co.,LTD
 */
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
