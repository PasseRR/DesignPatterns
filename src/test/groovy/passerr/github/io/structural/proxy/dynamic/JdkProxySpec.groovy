package passerr.github.io.structural.proxy.dynamic

import passerr.github.io.structural.proxy.Renting
import passerr.github.io.structural.proxy.Student
import passerr.github.io.structural.proxy.WhiteCollarWorker
import spock.lang.Specification

/**
 * @author xiehai1
 * @date 2017/08/04 12:35
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class JdkProxySpec extends Specification {
    def jdkProxyInterface() {
        given:
        def jdkProxy = new JdkProxy(target)
        def instance = (Renting) jdkProxy.getProxyInstance()
        expect:
        instance.rent() == result
        where:
        target                  || result
        new Student()           || "student rent"
        new WhiteCollarWorker() || "white collar worker rent"
    }

    def jdkProxyClass(){
        given:
        def jdkProxy = new JdkProxy(new Student())

        when:
        // 代理类不能被强转为Student
        def studentProxy = (Student) jdkProxy.getProxyInstance()
        then:
        thrown(Exception.class)
        studentProxy == null
    }
}