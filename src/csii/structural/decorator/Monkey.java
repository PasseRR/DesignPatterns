package csii.structural.decorator;

/**
 * ��ʥ����Ϊ����
 * @author xiehai
 * @date 2013-8-9 ����02:38:14 
 */
public class Monkey extends Change72{
	public Monkey() {
		
	}
	public Monkey(TheGreatestSage tsg){
		super(tsg);
	}
	@Override
	public void deform() {
		super.deform();
		System.out.print("--->����");
	}

}
