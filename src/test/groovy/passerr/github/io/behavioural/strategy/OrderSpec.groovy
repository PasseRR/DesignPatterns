package passerr.github.io.behavioural.strategy

import spock.lang.Shared
import spock.lang.Specification


/**
 * @author xiehai1
 * @date 2017/08/25 17:18
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class OrderSpec extends Specification {
    @Shared
    def selfPolicy = { BigDecimal it ->
        return it * (new BigDecimal("0.1"))
    }

    def order() {
        given:
        def order = new Order(new BigDecimal("100"))
        expect:
        order.check(policy) == amount

        where:
        policy               || amount
        new NormalPolicy()   || 100
        new PromotioPolicy() || 90
        new DeadlinePolicy() || 60
        // 自定义闭包策略
        selfPolicy           || 10
    }
}