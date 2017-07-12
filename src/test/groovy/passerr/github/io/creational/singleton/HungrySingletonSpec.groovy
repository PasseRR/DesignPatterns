package passerr.github.io.creational.singleton

import spock.lang.Specification

/**
 * @see HungrySingleton
 * @author xiehai1
 * @date 2017/07/12 20:55
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class HungrySingletonSpec extends Specification{
    def "is HungrySingleton singleton"(){
        given:
        def instance = HungrySingleton.getInstance()
        def anotherInstance = HungrySingleton.getInstance()

        expect:
        instance != null
        anotherInstance != null
        instance == anotherInstance
    }
}
