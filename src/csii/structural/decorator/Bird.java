package csii.structural.decorator;

/**
 * ��ʥ����
 * @author xiehai
 * @date 2013-8-9 ����02:39:26 
 */
public class Bird extends Change72{
	public Bird() {
		// TODO Auto-generated constructor stub
	}
	public Bird(TheGreatestSage tgs){
		super(tgs);
	}
	@Override
	public void deform() {
		super.deform();
		System.out.print("--->��");
	}

}
