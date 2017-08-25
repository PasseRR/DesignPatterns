package passerr.github.io.behavioural.templatemethod

import spock.lang.Specification


/**
 * @author xiehai1
 * @date 2017/08/25 18:11
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class CarSpec extends Specification {
    def car() {
        given:
        def Car myCar = car

        expect:
        myCar.drive() == result

        where:
        car                         || result
        new ManualGearshiftCar()    || "钥匙点火 -> 挂1挡 -> 前进"
        new AutomaticGearshiftCar() || "按钮点火 -> 挂D挡 -> 前进"
    }
}