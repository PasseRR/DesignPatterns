package csii.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * �����Ԫ�Ĺ���
 * @author xiehai
 * @date 2013-8-9 ����06:04:15 
 */
public class FlyweightFactory {
	Map<String, Flyweight> map = new HashMap<String, Flyweight>();
	Flyweight flyweight;
	
	public void typeFlyweight(TypeWord tw){
		flyweight = map.get(tw.getWord());
		if(null == flyweight){
			flyweight = new Word(tw.getWord());
			map.put(tw.getWord(), flyweight);			
		}
		flyweight.type(tw);
	}
}
