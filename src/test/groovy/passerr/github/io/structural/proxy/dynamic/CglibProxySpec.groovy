package passerr.github.io.structural.proxy.dynamic

import passerr.github.io.structural.proxy.Renting
import passerr.github.io.structural.proxy.Student
import passerr.github.io.structural.proxy.WhiteCollarWorker
import spock.lang.Specification
/**
 * @author xiehai1
 * @date 2017/08/04 18:29
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class CglibProxySpec extends Specification {
    def cglibProxyInterface(){
        given:
        def cglibProxy = new CglibProxy(target)
        def instance = (Renting) cglibProxy.getProxyInstance()
        expect:
        instance.rent() == result
        where:
        target                  || result
        new Student()           || "student rent"
        new WhiteCollarWorker() || "white collar worker rent"
    }

    def cglibProxyClass(){
        given:
        def cglibProxy = new CglibProxy(new Student())
        // 和jdk动态代理主要区别
        // jdk 获得实例返回的是接口
        // cglib 获得实例返回的是类
        def instance = (Student) cglibProxy.getProxyInstance()

        expect:
        instance.rent() == "student rent"
        instance.name() == "student"
    }
}