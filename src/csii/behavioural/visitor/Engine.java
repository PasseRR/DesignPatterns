package csii.behavioural.visitor;

/**
 * 发动机
 * @author xiehai
 * @date 2013-9-17 下午04:19:14 
 */
public class Engine implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
