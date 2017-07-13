package passerr.github.io.creational.abstractfactory

import spock.lang.Specification


/**
 * @see SonyTvFactory
 * @author xiehai1
 * @date 2017/07/13 13:17
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class SonyTvFactorySpec extends Specification {
    def "create 21 inch sony tv"(){
        given:
        def factory = new SonyTvFactory()
        def tv = factory.create21InchTv()

        expect:
        tv != null
        tv instanceof Sony21InchTv
    }

    def "create 50 inch sony tv"(){
        given:
        def factory = new SonyTvFactory()
        def tv = factory.create50InchTv()

        expect:
        tv != null
        tv instanceof Sony50InchTv
    }
}