package passerr.github.io.structural.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xiehai1
 * @date 2017/08/07 13:49
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class FlyweightFactory {
    private Map<String, Shape> cache = new ConcurrentHashMap<>();

    public Shape create(String shape){
        if(!this.cache.containsKey(shape)){
            synchronized (this.cache){
                if(!this.cache.containsKey(shape)){
                    this.cache.put(shape, new ConcreteShape(shape));
                }
            }
        }

        return this.cache.get(shape);
    }

    public int size(){
        return this.cache.size();
    }
}
