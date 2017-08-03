package passerr.github.io.structural.adapter

import spock.lang.Specification


/**
 * @author xiehai1
 * @date 2017/08/03 17:01
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class AmericaAdapterSpec extends Specification {
    def twoPinSoket(){
        given:
        def twoPinSoket = new TwoPinSoketChina()
        expect:
        twoPinSoket.chargeWithTwoPin() == "两孔插座"
        twoPinSoket.voltage() == 220
    }

    def threePinSoket(){
        given:
        def threePinSoket = new ThreePinSoketAmerica()
        expect:
        threePinSoket.chargeWithThreePin() == "三孔插座"
        threePinSoket.voltage() == 110
    }

    def adapter(){
        given:
        def threePinSoket = new ThreePinSoketAmerica()
        def twoPinSoket = new AmericaAdapter(threePinSoket)
        expect:
        twoPinSoket.chargeWithTwoPin() == "三孔插座"
        twoPinSoket.voltage() == 220
    }
}