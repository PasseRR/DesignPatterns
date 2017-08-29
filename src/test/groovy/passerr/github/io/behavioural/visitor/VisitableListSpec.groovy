package passerr.github.io.behavioural.visitor

import spock.lang.Specification

/**
 * @author xiehai1
 * @date 2017/08/29 14:01
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class VisitableListSpec extends Specification {
    def visit() {
        given:
        def list = new VisitableList<Order>()
        list.add(new Order(dayOfWeek: 1, amount: 6))
        list.add(new Order(dayOfWeek: 5, amount: 7))
        list.add(new Order(dayOfWeek: 2, amount: 12))
        list.add(new Order(dayOfWeek: 6, amount: 11))
        list.add(new Order(dayOfWeek: 7, amount: 8))

        when:
        // 工作日 统一总价打八折
        // 使用闭包/lambda实现Visitable接口
        list.visitEach({ t ->
            if (t.getDayOfWeek() < 6) {
                t.setAmount(t.getAmount() * 0.8)
            }
        })
        then:
        list.size() == 5

        when:
        // 周末 价格大于10块 打九折
        list.visitEach({ t ->
            if (t.getDayOfWeek() > 5 && t.getAmount() >= 10) {
                t.setAmount(t.getAmount() * 0.9)
            }
        })
        then:
        list.size() == 5
    }
}