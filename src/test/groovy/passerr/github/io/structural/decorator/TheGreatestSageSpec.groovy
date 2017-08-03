package passerr.github.io.structural.decorator

import spock.lang.Specification


/**
 * @author xiehai1
 * @date 2017/08/03 18:10
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class TheGreatestSageSpec extends Specification {
    def theGreatestSage() {
        expect:
        theGreatestSage.move() == changeProcess
        where:
        theGreatestSage                                                    || changeProcess
        new Monkey()                                                       || "monkey"
        new Bird(new Monkey())                                             || "monkey -> bird"
        new Tree(new Fish(new Monkey()))                                   || "monkey -> fish -> tree"
        new Fish(new Bird(new Temple(new Monkey())))                       || "monkey -> temple -> bird -> fish"
        new Temple(new Tree(new Bird(new Fish(new Monkey()))))             || "monkey -> fish -> bird -> tree -> temple"
        new Monkey(new Tree(new Temple(new Bird(new Fish(new Monkey()))))) || "monkey -> fish -> bird -> temple -> tree -> monkey"
    }
}