package passerr.github.io.creational.abstractfactory

import spock.lang.Specification


/**
 * @see HaierTvFactory
 * @author xiehai1
 * @date 2017/07/13 13:17
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class HaierTvFactorySpec extends Specification {
    def "create 21 inch haier tv"(){
        given:
        def factory = new HaierTvFactory()
        def tv = factory.create21InchTv()

        expect:
        tv != null
        tv instanceof Haier21InchTv
    }

    def "create 50 inch haier tv"(){
        given:
        def factory = new HaierTvFactory()
        def tv = factory.create50InchTv()

        expect:
        tv != null
        tv instanceof Haier50InchTv
    }
}