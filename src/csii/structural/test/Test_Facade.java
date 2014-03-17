package csii.structural.test;

import csii.structural.facade.Schoolmate;

/**
 * 门面模式测试
 * @author xiehai
 * @date 2013-9-16 上午11:12:06 
 */
public class Test_Facade {
	public static void main(String[] args) {
		Schoolmate sm = new Schoolmate();
		sm.leadSomebody();
	}
}
