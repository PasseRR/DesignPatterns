package csii.behavioural.templatemethod;


/**
 * ¼ÓÔËËã
 * @author xiehai
 * @date 2013-9-16 ÏÂÎç03:32:49 
 */
public class AddMethod extends AbstractMethod {
	
	@Override
	public int operator(int m, int n) {
		System.out.print(m + " + " + n);
		return m+n;
	}
	
}
