package csii.behavioural.strategy;

/**
 * 商户充值策略
 * @author xiehai
 * @date 2013-9-16 下午02:57:34 
 */
public class BussinessStrategy implements Strategy {
	@Override
	public double caclCharge(double charge) {
		return charge*SUPPLYER;
	}

}
