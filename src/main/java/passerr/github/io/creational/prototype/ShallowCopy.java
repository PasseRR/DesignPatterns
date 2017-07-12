package passerr.github.io.creational.prototype;

import lombok.Data;

/**
 * 浅拷贝
 * @author xiehai1
 * @date 2017/07/12 21:04
 * @Copyright(c) gome inc Gome Co.,LTD
 */
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
