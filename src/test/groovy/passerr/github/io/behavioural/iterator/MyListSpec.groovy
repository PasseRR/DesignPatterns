package passerr.github.io.behavioural.iterator

import spock.lang.Specification


/**
 * @author xiehai1
 * @date 2017/08/11 14:56
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class MyListSpec extends Specification {
    def myList(){
        def data
        given:
        def list = new MyList()
        list.add("hello")
        list.add("world")
        list.add("!")
        def iterator = list.iterator()

        expect:
        iterator != null
        iterator.hasNext()

        when:
        data = iterator.next()
        then:
        data == "hello"
        iterator.hasNext()

        when:
        data = iterator.next()
        then:
        data == "world"
        iterator.hasNext()

        when:
        data = iterator.next()
        then:
        data == "!"
        !iterator.hasNext()
    }
}