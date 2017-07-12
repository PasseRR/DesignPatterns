package passerr.github.io.creational.singleton

import spock.lang.Specification

/**
 * @see LazySingleton
 * @author xiehai1
 * @date 2017/07/12 20:40
 * @Copyright(c) gome inc Gome Co.,LTD
 */
class LazySingletonSpec extends Specification{
    def "is LazySingleton singleton"(){
        given:
        def instance = LazySingleton.getInstance()
        def anotherInstance = LazySingleton.getInstance()

        expect:
        instance != null
        anotherInstance != null
        instance == anotherInstance
    }
}
