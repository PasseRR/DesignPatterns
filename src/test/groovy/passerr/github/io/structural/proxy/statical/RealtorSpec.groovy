package passerr.github.io.structural.proxy.statical

import passerr.github.io.structural.proxy.Realtor
import passerr.github.io.structural.proxy.Student
import spock.lang.Specification


/**
 * @author xiehai1
 * @date 2017/08/04 10:55
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class RealtorSpec extends Specification {
    def renting() {
        expect:
        renting.rent() == result
        where:
        renting                 || result
        new Student()           || "student rent"
        new WhiteCollarWorker() || "white collar worker rent"
    }

    def realtor() {
        expect:
        realtor.rent() == result
        where:
        realtor                              || result
        new Realtor(new Student())           || "realtor in the name of student rent"
        new Realtor(new WhiteCollarWorker()) || "realtor in the name of white collar worker rent"
    }
}