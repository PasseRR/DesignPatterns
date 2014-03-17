package csii.behavioural.visitor;

/**
 * ������
 * @author xiehai
 * @date 2013-9-17 ����04:19:14 
 */
public class Engine implements Visitable {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
