package passerr.github.io.structural.bridge

import spock.lang.Specification
import spock.lang.Unroll


/**
 * @see Wechat
 * @author xiehai1
 * @date 2017/07/13 17:54
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class WechatSpec extends Specification {
    @Unroll
    def "#result"() {
        given:
        def wechat = new Wechat()
        wechat.setMessage(message)
        expect:
        wechat.send() == result
        where:
        message       || result
        new Picture() || "wechat send picture"
        new Text()    || "wechat send text"
        new Voice()   || "wechat send voice"
    }
}