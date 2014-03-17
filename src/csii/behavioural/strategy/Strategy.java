package csii.behavioural.strategy;

/**
 * ���Խӿ�
 * @author xiehai
 * @date 2013-9-16 ����02:50:39 
 */
public interface Strategy {
	/**
	 * ������ֵ
	 */
	double CYBER_BANK = 0.85;
	/**
	 * �̻���ֵ
	 */
	double SUPPLYER = 0.9;
	/**
	 * �㿨��ֵ
	 */
	double CARD = 0.01;
	/** 
	 * ���㷽��
	 * @param charge ��ֵ���
	 * @param type ��ֵ��ʽ
	 * @return
	 */
	double caclCharge(double charge);
}
