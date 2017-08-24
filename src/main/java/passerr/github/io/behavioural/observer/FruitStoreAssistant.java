package passerr.github.io.behavioural.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 水果店店员
 * @author xiehai1
 * @date 2017/08/24 15:15
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class FruitStoreAssistant extends Observable {
    public FruitStoreAssistant(Observer ...observers){
        super();
        if(observers != null && observers.length > 0){
            for(Observer observer : observers){
                super.addObserver(observer);
            }
        }
    }

    /**
     * 贩卖水果
     * @param order 水果订单
     */
    public void sell(Order order){
        super.setChanged();
        super.notifyObservers(order);
    }
}
