package csii.behavioural.templatemethod;


/**
 * ������
 * @author xiehai
 * @date 2013-9-16 ����03:32:49 
 */
public class AddMethod extends AbstractMethod {
	
	@Override
	public int operator(int m, int n) {
		System.out.print(m + " + " + n);
		return m+n;
	}
	
}
