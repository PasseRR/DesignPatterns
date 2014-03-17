package csii.behavioural.templatemethod;

/**
 * ³éÏóÄ£°æ
 * @author xiehai
 * @date 2013-9-16 ÏÂÎç03:19:53 
 */
public abstract class AbstractMethod {
	public void tempalteMethod(){
		show(operator(getNum1(), getNum2()));
	}
	public int getNum1(){
		return 8;
	}
	public int getNum2(){
		return 2;
	}
	public abstract int operator(int m, int n);
	public void show(int result){
		System.out.println(" = " + result);
	}
}
