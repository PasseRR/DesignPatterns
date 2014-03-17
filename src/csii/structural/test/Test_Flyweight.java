package csii.structural.test;

import csii.structural.flyweight.FlyweightFactory;
import csii.structural.flyweight.TypeWord;

/**
 * ��Ԫģʽ������
 * @author xiehai
 * @date 2013-8-9 ����06:04:05 
 */
public class Test_Flyweight {
	public static void main(String[] args) {
		FlyweightFactory ff = new FlyweightFactory();
		TypeWord tw1 = new TypeWord("1", 10);
		TypeWord tw2 = new TypeWord("2", 12);
		TypeWord tw3 = new TypeWord("2", 15);
		TypeWord tw4 = new TypeWord("1", 100);
		TypeWord tw5 = new TypeWord("��", 12);
		TypeWord tw6 = new TypeWord("����", 1);
		TypeWord tw7 = new TypeWord("��", 2);
		//"1"��"2"����������һ��
		ff.typeFlyweight(tw1);
		ff.typeFlyweight(tw2);
		ff.typeFlyweight(tw3);		
		ff.typeFlyweight(tw4);
		ff.typeFlyweight(tw5);
		ff.typeFlyweight(tw6);
		ff.typeFlyweight(tw7);
	}
}
