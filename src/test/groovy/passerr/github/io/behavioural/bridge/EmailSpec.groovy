package passerr.github.io.behavioural.bridge

import spock.lang.Specification
import spock.lang.Unroll


/**
 * @see Email
 * @author xiehai1
 * @date 2017/07/13 17:54
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class EmailSpec extends Specification {
    @Unroll
    def "#result"() {
        given:
        def email = new Email()
        email.setMessage(message)
        expect:
        email.send() == result
        where:
        message       || result
        new Picture() || "email send picture"
        new Text()    || "email send text"
        new Voice()   || "email send voice"
    }
}