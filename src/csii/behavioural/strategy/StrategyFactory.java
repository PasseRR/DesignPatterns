package csii.behavioural.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * ����ģʽ���� ����ģʽ
 * @author xiehai
 * @date 2013-9-16 ����02:59:55 
 */
public class StrategyFactory {
	private static StrategyFactory instance = null;
	private static Map<ChargeType, Strategy> map = new HashMap<ChargeType, Strategy>();
	static{
		map.put(ChargeType.CYBER_BANK, new EBankStrategy());
		map.put(ChargeType.SUPPLYER, new BussinessStrategy());
		map.put(ChargeType.MOBILE_PHONE, new MobilePhoneStrategy());
		map.put(ChargeType.CARD, new CardStrategy());
	}
	private StrategyFactory(){
		
	}
	/** 
	 * ��ȡ����ʵ��
	 * @return
	 */
	public static StrategyFactory getInstance(){
		if(null == instance){
			instance = new StrategyFactory();
		}
		return instance;
	}
	/** 
	 * ͨ����ֵ���ͻ�ò���
	 * @param type
	 * @return
	 */
	public Strategy creator(ChargeType type){
		return map.get(type);
	}
}
