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
        // 记录原始数据
        def book = new HashMap<Integer, Order>()
        book.put(1, new Order(dayOfWeek: 1, amount: 6))
        book.put(2, new Order(dayOfWeek: 2, amount: 12))
        book.put(5, new Order(dayOfWeek: 5, amount: 7))
        book.put(6, new Order(dayOfWeek: 6, amount: 11))
        book.put(7, new Order(dayOfWeek: 7, amount: 8))
        // 复制数据
        def list = new VisitableList<Order>()
        book.each { key, value ->
            list.add(new Order(dayOfWeek: value.getDayOfWeek(), amount: value.getAmount()))
        }
        when:
        // 工作日 统一总价打八折
        // 使用闭包/lambda实现Visitable接口
        list.visitEach({ t ->
            if (t.getDayOfWeek() < 6) {
                t.setAmount(t.getAmount() * 0.8)
            }
        })
        then:
        // 依次遍历list 确保数据一致
        list.every{ it ->
            def day = it.getDayOfWeek()
            if(day < 6){
                it.getAmount() == book.get(day).getAmount() * 0.8
            }else{
                it.getAmount() == book.get(day).getAmount()
            }
        }

        when:
        // 周末 价格大于10块 打九折
        list.visitEach({ t ->
            if (t.getDayOfWeek() > 5 && t.getAmount() >= 10) {
                t.setAmount(t.getAmount() * 0.9)
            }
        })
        then:
        // 依次遍历list 确保数据一致
        list.every { it ->
            def day = it.getDayOfWeek()
            if(day < 6){
                it.getAmount() == book.get(day).getAmount() * 0.8
            }else if(day > 5 && book.get(day).getAmount() >= 10){
                it.getAmount() == book.get(day).getAmount() * 0.9
            }else{
                it.getAmount() == book.get(day).getAmount()
            }
        }
    }
}