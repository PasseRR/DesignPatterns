package csii.behavioural.strategy;

/**
 * �̻���ֵ����
 * @author xiehai
 * @date 2013-9-16 ����02:57:34 
 */
public class BussinessStrategy implements Strategy {
	@Override
	public double caclCharge(double charge) {
		return charge*SUPPLYER;
	}

}
