package passerr.github.io.behavioural.composite

import spock.lang.Specification
/**
 * @see LinkedList
 * @author xiehai1
 * @date 2017/07/14 13:54
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class LinkedListSpec extends Specification {
    def "linked list"() {
        given:
        def list = new LinkedList()
        expect:
        list != null
        list.size() == 0

        when:
        list.add(1)
        then:
        1 == list.size()
        1 == list.get(0)

        when:
        list.add(2)
        then:
        2 == list.size()
        2 == list.get(1)

        when:
        list.add(null)
        then:
        3 == list.size()
        null == list.get(2)

        when:
        def remove = list.remove(1)
        then:
        remove
        2 == list.size()

        when:
        remove = list.remove(332)
        then:
        !remove
        2 == list.size()

        when:
        remove = list.remove(null)
        then:
        remove
        1 == list.size()

        when:
        remove = list.remove(2)
        then:
        remove
        0 == list.size()
        list.isEmpty()
    }
}