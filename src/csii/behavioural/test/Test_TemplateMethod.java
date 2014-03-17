package csii.behavioural.test;

import csii.behavioural.templatemethod.AbstractMethod;
import csii.behavioural.templatemethod.AddMethod;
import csii.behavioural.templatemethod.DivideMethod;
import csii.behavioural.templatemethod.MultiplyMethod;
import csii.behavioural.templatemethod.SubstractMethod;

/**
 * 模版方法测试类
 * @author xiehai
 * @date 2013-9-16 下午05:39:03 
 */
public class Test_TemplateMethod {
	public static void main(String[] args) {
		//加
		AbstractMethod add = new AddMethod();
		add.tempalteMethod();
		//减
		AbstractMethod substract = new SubstractMethod();
		substract.tempalteMethod();
		//乘
		AbstractMethod multiply = new MultiplyMethod();
		multiply.tempalteMethod();
		//除
		AbstractMethod divide = new DivideMethod();
		divide.tempalteMethod();
	}
}
