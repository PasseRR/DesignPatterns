package passerr.github.io.behavioural.facade;

/**
 * @author xiehai1
 * @date 2017/07/14 17:47
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class TradeService {
    // Spring inject
    private CashDao cashDao = new CashDao();
    private PointDao pointDao = new PointDao();

    // 用户使用现金消费 积分增加
    public void consume(Trade trade){
        this.cashDao.accountCash(trade);
        this.pointDao.accountPoint(trade);
    }
}
