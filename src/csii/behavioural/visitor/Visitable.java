package csii.behavioural.visitor;

/**
 * 抽象元素(Visitable)角色：声明一个接受操作，接受一个访问者对象作为一个参数。 
 * @author xiehai
 * @date 2013-9-17 下午04:14:59 
 */
public interface Visitable {
	void accept(Visitor visitor);
}
