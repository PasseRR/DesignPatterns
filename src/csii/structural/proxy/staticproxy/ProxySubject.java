package csii.structural.proxy.staticproxy;

/**
 * ��������
 * @author xiehai
 * @date 2013-8-9 ����03:47:04 
 */
public class ProxySubject {
	private RealSubject rs;
	/** 
	 * ͬѧ���೤˵Ҫ���
	 */
	public void requestForLeave(){
		if(rs == null){
			rs = new RealSubject();
		}
		System.out.println("ͬѧ���೤,������1���.");
		System.out.println("�೤���õ�,�Ұ�����һ����ʦ�������!");
		System.out.println("......");
		System.out.println("�೤����ʦ,xxxҪ���1��.");
		rs.askForLeave();
		System.out.println("ͬѧ��лл�೤.");

	}
}
