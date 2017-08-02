package passerr.github.io.structural.facade;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/07/14 17:45
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class PointDao {
    // 积分记账
    public void accountPoint(Trade trade){
        BigDecimal currentPoints = trade.getPoints();
        BigDecimal awardPoints = trade.getAwardPoints();
        trade.setPoints(currentPoints.add(awardPoints));
    }
}
