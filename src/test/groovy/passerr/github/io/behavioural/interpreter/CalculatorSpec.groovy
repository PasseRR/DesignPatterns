package passerr.github.io.behavioural.interpreter

import spock.lang.Specification


/**
 * @author xiehai1
 * @date 2017/08/09 18:16
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class CalculatorSpec extends Specification {
    def calculate() {
        given:
        def calculator = new Calculator(expression)
        def result = calculator.calculate()
        expect:
        result.isValid() == isValid
        result.getResult() == calculateResult
        where:
        expression                   || isValid || calculateResult
        "a"                          || false   || null
        "1+++1"                      || false   || null
        "-1+1"                       || false   || null
        "--1+1"                      || false   || null
        "1+1"                        || true    || 2
        "1+(1-1)"                    || true    || 1
        "12.232+((111+333.222)-2*5)" || true    || 446.454
    }
}