package csii.structural.decorator;

/**
 * 齐天大圣的七十二变 具体装饰类
 * @author xiehai
 * @date 2013-8-9 下午02:50:53 
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
			System.out.print("大圣");
		}else{
			tgs.deform();
		}
	}

}
