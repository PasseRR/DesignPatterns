package csii.behavioural.templatemethod;

/**
 * ³ËÔËËã
 * @author xiehai
 * @date 2013-9-16 ÏÂÎç03:34:59 
 */
public class MultiplyMethod extends AbstractMethod{

	@Override
	public int operator(int m, int n) {
		System.out.print(m + " * " + n);
		return m*n;
	}

}
