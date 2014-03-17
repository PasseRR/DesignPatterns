package csii.structural.adapter;

/**
 * 适配器 用来实现目标接口
 * @author xiehai
 * @date 2013-8-9 下午01:31:18 
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
