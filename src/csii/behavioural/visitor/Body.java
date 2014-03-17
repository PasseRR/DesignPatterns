package csii.behavioural.visitor;

/**
 * ����
 * @author xiehai
 * @date 2013-9-17 ����04:20:11 
 */
public class Body implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
