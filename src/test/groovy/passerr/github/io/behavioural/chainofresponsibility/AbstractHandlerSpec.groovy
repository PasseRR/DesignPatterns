package passerr.github.io.behavioural.chainofresponsibility

import spock.lang.Specification

/**
 * @author xiehai1
 * @date 2017/08/07 16:46
 * @Copyright ( c ) gome inc Gome Co.,LTD
 */
class AbstractHandlerSpec extends Specification {
    def leader() {
        given:
        def leader = new Leader()
        def handleResult = leader.handle(new HandleRequest(activityTheme: activityTheme, activityCapital: activityCapital))
        expect:
        handleResult.getIsOk() == isOk
        handleResult.getFrom() == fromPosition
        handleResult.getResult() == resultMessage

        where:
        activityCapital       | activityTheme || fromPosition || resultMessage || isOk
        new BigDecimal("100") | "团建"          || "leader"     || "团建 ok"       || Boolean.TRUE
        new BigDecimal("101") | "ktv"         || "leader"     || "ktv reject"  || Boolean.FALSE
    }

    def manager() {
        given:
        def manager = new Manager()
        def leader = new Leader(manager)
        def handleResult = leader.handle(new HandleRequest(activityTheme: activityTheme, activityCapital: activityCapital))
        expect:
        handleResult.getIsOk() == isOk
        handleResult.getFrom() == fromPosition
        handleResult.getResult() == resultMessage

        where:
        activityCapital       || activityTheme || fromPosition || resultMessage || isOk
        new BigDecimal("100") || "团建"          || "leader"     || "团建 ok"       || Boolean.TRUE
        new BigDecimal("101")  | "ktv"         || "manager"    || "ktv ok"      || Boolean.TRUE
        new BigDecimal("499")  | "乒乓球"         || "manager"    || "乒乓球 ok"      || Boolean.TRUE
        new BigDecimal("501")  | "室内篮球"        || "manager"    || "室内篮球 reject" || Boolean.FALSE
    }

    def boss() {
        given:
        def boss = new Boss()
        def manager = new Manager(boss)
        def leader = new Leader(manager)
        def handleResult = leader.handle(new HandleRequest(activityTheme: activityTheme, activityCapital: activityCapital))
        expect:
        handleResult.getIsOk() == isOk
        handleResult.getFrom() == fromPosition
        handleResult.getResult() == resultMessage

        where:
        activityCapital       || activityTheme || fromPosition || resultMessage || isOk
        new BigDecimal("100") || "团建"          || "leader"     || "团建 ok"       || Boolean.TRUE
        new BigDecimal("101")  | "ktv"         || "manager"    || "ktv ok"      || Boolean.TRUE
        new BigDecimal("499")  | "乒乓球"         || "manager"    || "乒乓球 ok"      || Boolean.TRUE
        new BigDecimal("501")  | "室内篮球"        || "boss"       || "室内篮球 ok"     || Boolean.TRUE
        new BigDecimal("1000") | "旅游"          || "boss"       || "旅游 ok"       || Boolean.TRUE
        new BigDecimal("1001") | "显卡"          || "boss"       || "显卡 reject"   || Boolean.FALSE
    }
}