package csii.creational.factory.simplefactory;

/**
 * 火车实现机器接口
 * @author xiehai
 * @date 2013-8-8 下午02:42:21 
 */
public class Train implements Machine {
	/**
	 * 火车车次
	 */
	String trainNO;
	/**
	 * 火车节数
	 */
	int nodeCount;
	@Override
	public void travel() {
		// TODO Auto-generated method stub

	}
	/** 
	 * 火车鸣笛
	 */
	public void whistle(){
		
	}
	public String getTrainNO() {
		return trainNO;
	}
	public void setTrainNO(String trainNO) {
		this.trainNO = trainNO;
	}
	public int getNodeCount() {
		return nodeCount;
	}
	public void setNodeCount(int nodeCount) {
		this.nodeCount = nodeCount;
	}
	public String toString(){
		return "我是" + this.trainNO + "次列车, 共有" + this.nodeCount + "节车厢";
	}
}
