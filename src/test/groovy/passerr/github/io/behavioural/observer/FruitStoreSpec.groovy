package passerr.github.io.behavioural.observer

import spock.lang.Specification
/**
 * @author xiehai1
 * @date 2017/08/24 15:43
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class FruitStoreSpec extends Specification {
    def fruitStoreEach() {
        given:
        def boss = new FruitsStoreBoss()
        def landlady = new FruitsStoreLandlady()
        def assistant = new FruitStoreAssistant(boss, landlady)

        when:
        assistant.sell(new Order(fruit, weight))
        then:
        landlady.getTotal() == totalAmount
        boss.getTotal() == totalWeight

        where:
        fruit        | weight || totalAmount                  || totalWeight
        Fruit.PLUM   | 8.7    || Fruit.PLUM.unitPrice * 8.7   || 8.7
        Fruit.APPLE  | 1      || Fruit.APPLE.unitPrice * 1    || 1
        Fruit.GRAPE  | 2.3    || Fruit.GRAPE.unitPrice * 2.3  || 2.3
        Fruit.ORANGE | 2.5    || Fruit.ORANGE.unitPrice * 2.5 || 2.5
    }
}