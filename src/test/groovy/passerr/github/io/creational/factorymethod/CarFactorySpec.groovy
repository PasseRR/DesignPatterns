package passerr.github.io.creational.factorymethod

import spock.lang.Specification


/**
 * @see CarFactory
 * @author xiehai1
 * @date 2017/07/12 22:12
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class CarFactorySpec extends Specification {
    def "create"(){
        given:
        def carFactory = new CarFactory()
        def benz = carFactory.create(BenzCar.class)
        def bmw = carFactory.create(BmwCar.class)
        def audi = carFactory.create(AudiCar.class)

        expect:
        benz != null
        bmw != null
        audi != null
        benz instanceof BenzCar
        bmw instanceof BmwCar
        audi instanceof AudiCar
        benz.getName() == "Benz"
        bmw.getName() == "Bmw"
        audi.getName() == "Audi"
    }
}