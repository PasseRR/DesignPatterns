package csii.structural.bridge;

/**
 * 装载货物
 * @author xiehai
 * @date 2013-9-16 上午11:21:22 
 */
public class TransportGoods implements Transport{

	@Override
	public void transport() {
		System.out.println("正在运输货物!");
	}

}
