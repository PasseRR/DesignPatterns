package csii.structural.decorator;

/**
 * 大圣变成了鱼
 * @author xiehai
 * @date 2013-8-9 下午03:19:40 
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
		System.out.print("--->鱼");
	}

}
