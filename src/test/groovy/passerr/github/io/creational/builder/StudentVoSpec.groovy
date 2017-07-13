package passerr.github.io.creational.builder

import spock.lang.Specification


/**
 * @see StudentVo
 * @author xiehai1
 * @date 2017/07/13 10:04
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class StudentVoSpec extends Specification {
    def build() {
        when:
        def student = StudentVo.builder()
            .name("Jack")
            .build()
        then:
        student != null
        student.name == "Jack"
        student.sex == null
        student.age == null
        student.no == null

        when:
        student = StudentVo.builder()
            .name("zhangsan")
            .age(10)
            .sex("male")
            .build()
        then:
        student != null
        student.name == "zhangsan"
        student.age == 10
        student.sex == "male"
        student.no == null
    }
}