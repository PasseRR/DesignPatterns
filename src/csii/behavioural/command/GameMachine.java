package csii.behavioural.command;

/**
 * ��Ϸ��
 * @author xiehai
 * @date 2013-9-17 ����10:31:02 
 */
public class GameMachine {
	/** 
	 * ��ȭ
	 */
	public void fist(){
		System.out.println("��Ϸ��ɫ��ȭ!");
	}
	
	/** 
	 * ����
	 */
	public void kick(){
		System.out.println("��Ϸ��ɫ����!");
	}
	
	/** 
	 * �ƶ�
	 * @param direction ����
	 */
	public void move(String direction){
		System.out.println("��Ϸ��ɫ��" + direction + "�ƶ�");
	}
}
