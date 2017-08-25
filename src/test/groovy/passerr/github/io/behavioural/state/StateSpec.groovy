package passerr.github.io.behavioural.state

import spock.lang.Specification

import static passerr.github.io.behavioural.state.State.*

/**
 * @author xiehai1
 * @date 2017/08/25 14:20
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class StateSpec extends Specification {
    def task() {
        given:
        def task = new Task(time, isDone)
        expect:
        task.coding() == state
        where:
        time | isDone || state
        1    | false  || String.format(NIGHT_STATE, 1)
        10   | false  || String.format(FORENOON_STATE, 10)
        12   | false  || String.format(NOON_STATE, 12)
        13   | true   || String.format(OFF_DUTY_STATE, 13)
        14   | false  || String.format(AFTERNOON_STATE, 14)
        19   | false  || String.format(EVENING_STATE, 19)
        20   | true   || String.format(OFF_DUTY_STATE, 20)
        23   | false  || String.format(NIGHT_STATE, 23)
        23   | true   || String.format(OFF_DUTY_STATE, 23)
    }
}