package passerr.github.io.creational.singleton

import spock.lang.Specification

/**
 * @see DoubleLockSingleton
 * @author xiehai1
 * @date 2017/07/12 20:57
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class DoubleLockSingletonSpec extends Specification{
    def "is DoubleLockSingleton singleton"(){
        given:
        def instance = DoubleLockSingleton.getInstance()
        def anotherInstance = DoubleLockSingleton.getInstance()

        expect:
        instance != null
        anotherInstance != null
        instance == anotherInstance
        instance.is(anotherInstance)
    }
}
