package csii.behavioural.test;

import csii.behavioural.templatemethod.AbstractMethod;
import csii.behavioural.templatemethod.AddMethod;
import csii.behavioural.templatemethod.DivideMethod;
import csii.behavioural.templatemethod.MultiplyMethod;
import csii.behavioural.templatemethod.SubstractMethod;

/**
 * ģ�淽��������
 * @author xiehai
 * @date 2013-9-16 ����05:39:03 
 */
public class Test_TemplateMethod {
	public static void main(String[] args) {
		//��
		AbstractMethod add = new AddMethod();
		add.tempalteMethod();
		//��
		AbstractMethod substract = new SubstractMethod();
		substract.tempalteMethod();
		//��
		AbstractMethod multiply = new MultiplyMethod();
		multiply.tempalteMethod();
		//��
		AbstractMethod divide = new DivideMethod();
		divide.tempalteMethod();
	}
}
