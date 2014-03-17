package csii.creational.builder;

/**
 * ������Ʒ ���д���ӿ� �ýӿ�������ʵ�ʲ�Ʒ
 * @author xiehai
 * @date 2013-8-8 ����05:03:01 
 */
public class Car {
	private Shell shell;
	private Engine engine;
	private Chassis chassis;
	private Chair chair;
	private Tyre tyre;
	public Shell getShell() {
		return shell;
	}
	public void setShell(Shell shell) {
		this.shell = shell;
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public Chassis getChassis() {
		return chassis;
	}
	public void setChassis(Chassis chassis) {
		this.chassis = chassis;
	}
	public Chair getChair() {
		return chair;
	}
	public void setChair(Chair chair) {
		this.chair = chair;
	}
	public Tyre getTyre() {
		return tyre;
	}
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	public String toString(){
		return this.engine.toString()+ ", " +
		this.tyre.toString()+ ", " +
		this.shell.toString()+ ", " +
		this.chassis.toString()+ ", "+
		this.chair.toString();
	}
}
