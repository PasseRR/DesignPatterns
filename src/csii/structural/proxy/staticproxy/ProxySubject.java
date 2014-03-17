package csii.structural.proxy.staticproxy;

/**
 * 代理主题
 * @author xiehai
 * @date 2013-8-9 下午03:47:04 
 */
public class ProxySubject {
	private RealSubject rs;
	/** 
	 * 同学跟班长说要请假
	 */
	public void requestForLeave(){
		if(rs == null){
			rs = new RealSubject();
		}
		System.out.println("同学：班长,我想请1天假.");
		System.out.println("班长：好的,我帮你问一下老师的意见吧!");
		System.out.println("......");
		System.out.println("班长：老师,xxx要请假1天.");
		rs.askForLeave();
		System.out.println("同学：谢谢班长.");

	}
}
