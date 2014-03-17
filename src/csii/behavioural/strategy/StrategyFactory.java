package csii.behavioural.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略模式工厂 单例模式
 * @author xiehai
 * @date 2013-9-16 下午02:59:55 
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
	 * 获取单例实例
	 * @return
	 */
	public static StrategyFactory getInstance(){
		if(null == instance){
			instance = new StrategyFactory();
		}
		return instance;
	}
	/** 
	 * 通过充值类型获得策略
	 * @param type
	 * @return
	 */
	public Strategy creator(ChargeType type){
		return map.get(type);
	}
}
