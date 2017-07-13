package passerr.github.io.behavioural.bridge

import spock.lang.Specification
import spock.lang.Unroll


/**
 * @see Qicq
 * @author xiehai1
 * @date 2017/07/13 17:54
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class QicqSpec extends Specification {
    @Unroll
    def "#result"() {
        given:
        def qicq = new Qicq()
        qicq.setMessage(message)
        expect:
        qicq.send() == result
        where:
        message       || result
        new Picture() || "qicq send picture"
        new Text()    || "qicq send text"
        new Voice()   || "qicq send voice"
    }
}