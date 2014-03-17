package csii.behavioural.strategy;

/**
 * 策略接口
 * @author xiehai
 * @date 2013-9-16 下午02:50:39 
 */
public interface Strategy {
	/**
	 * 网银充值
	 */
	double CYBER_BANK = 0.85;
	/**
	 * 商户充值
	 */
	double SUPPLYER = 0.9;
	/**
	 * 点卡充值
	 */
	double CARD = 0.01;
	/** 
	 * 计算方法
	 * @param charge 充值金额
	 * @param type 充值方式
	 * @return
	 */
	double caclCharge(double charge);
}
