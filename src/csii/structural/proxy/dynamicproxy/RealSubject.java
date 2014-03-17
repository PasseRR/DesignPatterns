package csii.structural.proxy.dynamicproxy;

/**
 * 真实主题
 * @author xiehai
 * @date 2013-8-9 下午03:46:22 
 */
public class RealSubject implements Subject{

	@Override
	public void askForLeave() {
		//老师批假
		System.out.println("老师：准了.");
	}
}
