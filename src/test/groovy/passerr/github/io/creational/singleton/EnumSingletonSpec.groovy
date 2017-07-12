package passerr.github.io.creational.singleton

import spock.lang.Specification

/**
 * @see EnumSingleton
 * @author xiehai1
 * @date 2017/07/12 20:58
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class EnumSingletonSpec extends Specification{
    def "is EnumSingleton singleton"(){
        given:
        def instance = EnumSingleton.INSTANCE
        def anotherInstance = EnumSingleton.INSTANCE

        expect:
        instance != null
        anotherInstance != null
        instance == anotherInstance
    }
}
