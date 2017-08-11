package passerr.github.io.behavioural.mediator

import spock.lang.Specification


/**
 * @author xiehai1
 * @date 2017/08/11 18:17
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class AtmSpec extends Specification {
    def atm(){
        given:
        def bank = new Bank(new BigDecimal("1000"))
        def customer1 = new Customer(new BigDecimal("250"))
        def customer2 = new Customer(new BigDecimal("200"))

        when:
        def atm1 = new Atm(bank, customer1)
        atm1.deposit("1234", new BigDecimal("100"))
        then:
        customer1.getCash() == new BigDecimal("150")
        bank.getBalance() == new BigDecimal("1100")


        when:
        atm1.withdraw("1234", new BigDecimal("50"))
        then:
        customer1.getCash() == new BigDecimal("200")
        bank.getBalance() == new BigDecimal("1050")

        when:
        def atm2 = new Atm(bank, customer2)
        atm2.withdraw("4321", new BigDecimal("20"))
        then:
        customer2.getCash() == new BigDecimal("220")
        bank.getBalance() == new BigDecimal("1030")

        when:
        atm2.deposit("4321", new BigDecimal("70"))
        then:
        customer2.getCash() == new BigDecimal("150")
        bank.getBalance() == new BigDecimal("1100")
    }
}