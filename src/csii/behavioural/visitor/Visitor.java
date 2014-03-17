package csii.behavioural.visitor;

/**
 * 抽象访问者（Visitor）角色：定义接口，声明一个或多个访问操作。 
 * @author xiehai
 * @date 2013-9-17 下午04:16:17 
 */
public interface Visitor {
	void visit(Visitable visitable);
}
