package passerr.github.io.behavioural.memento

import spock.lang.Specification


/**
 * @author xiehai1
 * @date 2017/08/14 10:22
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class JarSpec extends Specification {
    def jar(){
        given:
        def jar = new Jar(groupId: "com.gome", artifactId: "pattern", version: "1.0.0")
        jar.save()
        jar.setVersion("1.0.1")
        expect:
        jar != null
        jar.groupId == "com.gome"
        jar.artifactId == "pattern"
        jar.version == "1.0.1"

        when:
        jar.undo()
        then:
        jar.groupId == "com.gome"
        jar.artifactId == "pattern"
        jar.version == "1.0.0"

        when:
        jar.setGroupId("org.apache")
        jar.save()
        jar.setGroupId("com.gome")
        jar.setVersion("1.2.1")
        jar.undo()
        then:
        jar.groupId == "org.apache"
        jar.artifactId == "pattern"
        jar.version == "1.0.0"
    }
}