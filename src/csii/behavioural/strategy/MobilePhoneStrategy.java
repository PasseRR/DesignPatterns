package csii.behavioural.strategy;

/**
 * 手机充值策略
 * @author xiehai
 * @date 2013-9-16 下午02:58:22 
 */
public class MobilePhoneStrategy implements Strategy{
	@Override
	public double caclCharge(double charge) {
		return charge;
	}
	
}
