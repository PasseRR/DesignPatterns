package passerr.github.io.behavioural.command

import spock.lang.Specification


/**
 * @author xiehai1
 * @date 2017/08/08 16:30
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class CommandSpec extends Specification {
    def control() {
        given:
        def tv = new Television("佳能电视")
        def control = new RemoteControl(tv)

        when:
        def on = control.turnOn()
        then:
        on == tv.getName() + " on!"

        when:
        def volumeUp = control.volumeUp()
        then:
        volumeUp == tv.getVolume()

        when:
        def volumeDown = control.volumeDown()
        then:
        volumeDown == tv.getVolume()

        when:
        def channelUp = control.channelUp()
        then:
        channelUp == tv.getChannel()

        when:
        def channelDown = control.channelDown()
        then:
        channelDown == tv.getChannel()

        when:
        def off = control.turnOff()
        then:
        off == tv.getName() + " off!"
    }

    def command(){
        given:
        def tv = new Television()
        def control = new RemoteControl(tv)
        def onMsg = "金光闪闪的打开!"
        def offMsg = "牛逼哄哄的关掉!"
        control.setTurnOn({
            return tv.getName() + onMsg
        })
        control.setTurnOff({
            return tv.getName() + offMsg
        })

        when:
        def on = control.turnOn()
        then:
        on == tv.getName() + onMsg

        when:
        def off = control.turnOff()
        then:
        off == tv.getName() + offMsg
    }
}