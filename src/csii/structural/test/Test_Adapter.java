package csii.structural.test;

import csii.structural.adapter.Adaptee;
import csii.structural.adapter.Adapter;
import csii.structural.adapter.Adapter2;

/**
 * 适配器测试类
 * @author xiehai
 * @date 2013-8-9 下午01:31:59 
 */
public class Test_Adapter {
	public static void main(String[] args) {
		//第一种适配器
		Adapter adapter = Adapter.getInstance();
		adapter.doWhatWannaDo();
		//第二种适配器
		Adaptee adaptee = new Adaptee();
		//set Adaptee的属性,然后Adapter使用
		Adapter2 adapter2 = new Adapter2(adaptee);
		adapter2.doWhatWannaDo();
	}
}
