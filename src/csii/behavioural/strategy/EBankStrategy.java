package csii.behavioural.strategy;

/**
 * ������ֵ����
 * @author xiehai
 * @date 2013-9-16 ����02:56:13 
 */
public class EBankStrategy implements Strategy {
	@Override
	public double caclCharge(double charge) {
		return charge*CYBER_BANK;
	}

}
