package csii.behavioural.visitor;

/**
 * ³µÂÖ
 * @author xiehai
 * @date 2013-9-17 ÏÂÎç04:19:37 
 */
public class Wheel implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
