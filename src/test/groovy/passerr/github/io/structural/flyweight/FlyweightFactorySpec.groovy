package passerr.github.io.structural.flyweight

import spock.lang.Specification

/**
 * @author xiehai1
 * @date 2017/08/07 13:56
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class FlyweightFactorySpec extends Specification {
    def flyweightInnerState() {
        given:
        def factory = new FlyweightFactory()

        when:
        def circle = factory.create("circle")
        def circleCopy = factory.create("circle")
        then:
        circle != null
        circleCopy != null
        circle == circleCopy
        circle.is(circleCopy)

        when:
        def rectangle = factory.create("rectangle")
        def rectangleCopy = factory.create("rectangle")
        then:
        rectangle != null
        rectangleCopy != null
        rectangle == rectangleCopy
        rectangle.is(rectangleCopy)

        when:
        def triangle = factory.create("triangle")
        def triangleCopy = factory.create("triangle")
        then:
        triangle != null
        triangleCopy != null
        triangle == triangleCopy
        triangle.is(triangleCopy)

        expect:
        factory.size() == 3
    }

    def flyweightOuterState() {
        given:
        def factory = new FlyweightFactory()

        expect:
        factory.create(shape).draw(new Color(color)) == draw

        where:
        shape       | color    || draw
        "circle"    | "red"    || "draw a red circle"
        "rectangle" | "yellow" || "draw a yellow rectangle"
        "triangle"  | "black"  || "draw a black triangle"
        "circle"    | "black"  || "draw a black circle"
    }
}