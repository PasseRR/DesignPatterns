package csii.structural.test;

import csii.structural.flyweight.FlyweightFactory;
import csii.structural.flyweight.TypeWord;

/**
 * 享元模式测试类
 * @author xiehai
 * @date 2013-8-9 下午06:04:05 
 */
public class Test_Flyweight {
	public static void main(String[] args) {
		FlyweightFactory ff = new FlyweightFactory();
		TypeWord tw1 = new TypeWord("1", 10);
		TypeWord tw2 = new TypeWord("2", 12);
		TypeWord tw3 = new TypeWord("2", 15);
		TypeWord tw4 = new TypeWord("1", 100);
		TypeWord tw5 = new TypeWord("我", 12);
		TypeWord tw6 = new TypeWord("我你", 1);
		TypeWord tw7 = new TypeWord("我", 2);
		//"1"和"2"仅被创建了一次
		ff.typeFlyweight(tw1);
		ff.typeFlyweight(tw2);
		ff.typeFlyweight(tw3);		
		ff.typeFlyweight(tw4);
		ff.typeFlyweight(tw5);
		ff.typeFlyweight(tw6);
		ff.typeFlyweight(tw7);
	}
}
