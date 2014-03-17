package csii.behavioural.test;

import csii.behavioural.strategy.ChargeType;
import csii.behavioural.strategy.Context;

/**
 * 策略模式测试类
 * @author xiehai
 * @date 2013-9-16 下午05:38:49 
 */
public class Test_Strategy {
	public static void main(String[] args) {
		Context ctx = new Context();
		double charge = 100d;
		double chargeResult = ctx.caclCharge(charge, ChargeType.CYBER_BANK);
		System.out.println(chargeResult);
		chargeResult = ctx.caclCharge(charge, ChargeType.SUPPLYER);
		System.out.println(chargeResult);
		chargeResult = ctx.caclCharge(charge, ChargeType.MOBILE_PHONE);
		System.out.println(chargeResult);
		chargeResult = ctx.caclCharge(charge, ChargeType.CARD);
		System.out.println(chargeResult);
	}
}
