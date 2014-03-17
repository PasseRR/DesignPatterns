package csii.behavioural.strategy;

/**
 * 网银充值策略
 * @author xiehai
 * @date 2013-9-16 下午02:56:13 
 */
public class EBankStrategy implements Strategy {
	@Override
	public double caclCharge(double charge) {
		return charge*CYBER_BANK;
	}

}
