package csii.structural.test;

import csii.structural.decorator.Bird;
import csii.structural.decorator.Change72;
import csii.structural.decorator.Fish;
import csii.structural.decorator.Monkey;
import csii.structural.decorator.TheGreatestSage;

/**
 * 装饰模式测试类
 * @author xiehai
 * @date 2013-8-9 下午02:52:47 
 */
public class Test_Decorator {
	public static void main(String[] args) {
		TheGreatestSage monkey = new Change72(new Monkey(new Bird(new Fish())));
		monkey.deform();
		System.out.println();
		
		TheGreatestSage fish = new Change72(new Fish(new Bird(new Monkey(new Fish(new Monkey(new Bird()))))));
		fish.deform();
		System.out.println();
		
		TheGreatestSage tgs = new Change72();
		tgs.deform();
	}
}
