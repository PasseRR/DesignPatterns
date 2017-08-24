package passerr.github.io.behavioural.observer;

import lombok.Getter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

/**
 * 水果店老板关心水果分别卖出多少重量
 * @author xiehai1
 * @date 2017/08/24 15:16
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Getter
public class FruitsStoreBoss implements Observer {
    private Map<Fruit, BigDecimal> statistics = new HashMap<>();
    private BigDecimal total = new BigDecimal("0");

    public FruitsStoreBoss(){
        Fruit []fruits = Fruit.values();
        for(Fruit fruit : fruits){
            statistics.put(fruit, new BigDecimal("0"));
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof Order){
            this.account((Order) arg);
        }
    }

    private void account(Order order){
        Fruit fruit = order.getType();
        BigDecimal current = this.statistics.get(fruit);
        this.statistics.put(fruit, current.add(order.getWeight()));
        this.total = this.total.add(order.getWeight());
    }
}
