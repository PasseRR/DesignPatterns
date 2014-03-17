package csii.creational.factory.simplefactory;


/**
 * 工厂模式之简单工厂
 * @author xiehai
 * @date 2013-8-8 下午02:34:28 
 */
public class SimpleFactory {
	public static final String CAR = "car";
	public static final String TRACTOR = "tractor";
	public static final String TRAIN = "train";
	/** 
	 * 机器实例创建方法
	 * @param machine
	 * @return
	 */
	public Machine createMachine(String machine){
		if(CAR.equals(machine)){
			return new Car();
		}else if(TRACTOR.equals(machine)){
			return new Tractor();
		}else if(TRAIN.equals(machine)){
			return new Train();
		}
		return null;
	}
}
