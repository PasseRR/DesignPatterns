package csii.behavioural.templatemethod;

/**
 * ³ıÔËËã
 * @author xiehai
 * @date 2013-9-16 ÏÂÎç03:35:53 
 */
public class DivideMethod extends AbstractMethod {

	@Override
	public int operator(int m, int n) {
		System.out.print(m + " / " + n);
		return m/n;
	}

}
