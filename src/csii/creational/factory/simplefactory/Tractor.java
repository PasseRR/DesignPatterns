package csii.creational.factory.simplefactory;

/**
 * 拖拉机实现机器的接口
 * @author xiehai
 * @date 2013-8-8 下午02:38:17 
 */
public class Tractor implements Machine{

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		
	}
	
	/** 
	 * 拖拉机可以耕地 
	 */
	public void plough(){
		System.out.println("我在耕地");
	}
}
