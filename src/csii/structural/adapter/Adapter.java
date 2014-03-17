package csii.structural.adapter;

/**
 * ������ ����ʵ��Ŀ��ӿ�
 * @author xiehai
 * @date 2013-8-9 ����01:31:18 
 */
public class Adapter extends Adaptee implements Target {
	private static Adapter instance = null;
	
	private Adapter(){
		
	}
	
	public static synchronized Adapter getInstance(){
		if(instance == null){
			instance = new Adapter();
		}
		return instance;
	}
	
	@Override
	public void doWhatWannaDo() {
		this.doWhatICanDo();
	}
}
