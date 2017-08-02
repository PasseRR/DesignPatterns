package passerr.github.io.structural.facade;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/07/14 17:45
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class CashDao {
    // 现金/余额记账
    public void accountCash(Trade trade){
        BigDecimal currentCash = trade.getCash();
        BigDecimal consumeCash = trade.getConsumeCash();
        trade.setCash(currentCash.subtract(consumeCash));
    }
}
