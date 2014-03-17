package csii.structural.adapter;

/**
 * ������ ����ʵ��Ŀ��ӿ�
 * @author xiehai
 * @date 2013-8-9 ����01:31:18 
 */
public class Adapter2 implements Target {
	private Adaptee adaptee;
	/**
	 * Java�ǵ��̳е����ԣ������������ģʽ�����ܵ�ʹ�û��������ƣ�
	 * ������������ԭ���У���һ���������/�ۺϸ���ԭ��
	 * �����Ǿ�����ʹ����Ϻ;ۺϴﵽ���õ�Ŀ�Ķ����Ǽ̳У�
	 * ����һ���Ƽ��ö���������ģʽ�ﵽĿ��
	 */
	public Adapter2() {
		// TODO Auto-generated constructor stub
	}
	public Adapter2(Adaptee adaptee){
		this.adaptee = adaptee;
	}
	@Override
	public void doWhatWannaDo() {
		this.adaptee.doWhatICanDo();
	}
}
