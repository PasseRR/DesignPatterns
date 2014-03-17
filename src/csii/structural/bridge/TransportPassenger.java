package csii.structural.bridge;

/**
 * 运输乘客
 * @author xiehai
 * @date 2013-9-16 上午11:22:41 
 */
public class TransportPassenger implements Transport{

	@Override
	public void transport() {
		System.out.println("正在运输乘客!");
	}
	
}
