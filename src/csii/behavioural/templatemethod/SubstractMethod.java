package csii.behavioural.templatemethod;

/**
 * ������
 * @author xiehai
 * @date 2013-9-16 ����03:32:59 
 */
public class SubstractMethod extends AbstractMethod{

	@Override
	public int operator(int m, int n) {
		System.out.print(m + " - " + n);
		return m-n;
	}

}
