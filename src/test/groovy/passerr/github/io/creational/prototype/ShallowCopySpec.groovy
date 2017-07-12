package passerr.github.io.creational.prototype

import spock.lang.Specification
/**
 * @see ShallowCopy
 * @author xiehai1
 * @date 2017/07/12 21:15
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class ShallowCopySpec extends Specification {
    def "is same by shallow copy"(){
        given:
        def source = new ShallowCopy(
            name: "Jack",
            copyType: new CopyType(type: "shallow")
        )
        def copy = (ShallowCopy) source.clone()

        expect:
        copy != null
        copy.name != null
        copy.copyType != null
        copy.name == source.name
        copy.copyType.type == source.copyType.type
        copy.copyType == source.copyType
        source != copy

        when:
        copy.name = "Jack Chen"
        copy.copyType.type = "just shallow"

        then:
        source.name != copy.name
        source.copyType.type == copy.copyType.type
        source.copyType == copy.copyType
        source != copy
    }
}