package csii.structural.decorator;

/**
 * �����ʥ����ʮ���� ����װ����
 * @author xiehai
 * @date 2013-8-9 ����02:50:53 
 */
public class Change72 implements TheGreatestSage{
	private TheGreatestSage tgs;
	public Change72() {
		// TODO Auto-generated constructor stub
	}
	public Change72(TheGreatestSage tgs){
		this.tgs = tgs;
	}
	@Override
	public void deform() {
		if(tgs == null){
			System.out.print("��ʥ");
		}else{
			tgs.deform();
		}
	}

}
