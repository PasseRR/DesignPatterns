package csii.structural.decorator;

/**
 * ��ʥ�������
 * @author xiehai
 * @date 2013-8-9 ����03:19:40 
 */
public class Fish extends Change72{
	public Fish() {
		// TODO Auto-generated constructor stub
	}
	public Fish(TheGreatestSage tgs){
		super(tgs);
	}
	@Override
	public void deform() {
		super.deform();
		System.out.print("--->��");
	}

}
