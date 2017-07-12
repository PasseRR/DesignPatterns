package passerr.github.io.creational.prototype

import spock.lang.Specification


/**
 * @see DeepCopy
 * @author xiehai1
 * @date 2017/07/12 21:15
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class DeepCopySpec extends Specification {
    def "is same by deep copy"(){
        given:
        def source = new DeepCopy(
            name: "Jack",
            copyType: new CopyType(type: "deep")
        )
        def copy = (DeepCopy) source.clone()

        expect:
        copy != null
        copy.name != null
        copy.copyType != null
        copy.name == source.name
        copy.copyType.type == source.copyType.type
        copy.copyType != source.copyType
        copy != source

        when:
        copy.name = "Jack Chen"
        copy.copyType.type = "just deep"

        then:
        source.name != copy.name
        source.copyType.type != copy.copyType.type
        source.copyType != copy.copyType
        source != copy
    }
}