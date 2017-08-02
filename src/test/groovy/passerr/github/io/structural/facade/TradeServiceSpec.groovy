package passerr.github.io.structural.facade

import spock.lang.Specification


/**
 * @author xiehai1
 * @date 2017/07/14 17:56
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class TradeServiceSpec extends Specification {
    def "facade"() {
        given:
        def trade = Trade.builder()
            .userId(new BigInteger("1"))
            .cash(new BigDecimal("20"))
            .points(new BigDecimal("100"))
            .consumeCash(new BigDecimal("10"))
            .awardPoints(new BigDecimal("100"))
            .build()
        def tradeService = new TradeService()

        when:
        tradeService.consume(trade)
        then:
        trade.getCash() == new BigDecimal("10")
        trade.getPoints() == new BigDecimal("200")
    }

    def "not use facade"(){
        given:
        def trade = Trade.builder()
            .userId(new BigInteger("1"))
            .cash(new BigDecimal("20"))
            .points(new BigDecimal("100"))
            .consumeCash(new BigDecimal("10"))
            .awardPoints(new BigDecimal("100"))
            .build()
        def cashDao = new CashDao()
        def pointDao = new PointDao()

        when:
        cashDao.accountCash(trade)
        then:
        trade.getCash() == new BigDecimal("10")

        when:
        pointDao.accountPoint(trade)
        then:
        trade.getPoints() == new BigDecimal("200")
    }
}