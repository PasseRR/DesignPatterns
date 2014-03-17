package csii.structural.decorator;

/**
 * 大圣变形为猴子
 * @author xiehai
 * @date 2013-8-9 下午02:38:14 
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
		System.out.print("--->猴子");
	}

}
