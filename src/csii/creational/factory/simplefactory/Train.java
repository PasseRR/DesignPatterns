package csii.creational.factory.simplefactory;

/**
 * ��ʵ�ֻ����ӿ�
 * @author xiehai
 * @date 2013-8-8 ����02:42:21 
 */
public class Train implements Machine {
	/**
	 * �𳵳���
	 */
	String trainNO;
	/**
	 * �𳵽���
	 */
	int nodeCount;
	@Override
	public void travel() {
		// TODO Auto-generated method stub

	}
	/** 
	 * ������
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
		return "����" + this.trainNO + "���г�, ����" + this.nodeCount + "�ڳ���";
	}
}
