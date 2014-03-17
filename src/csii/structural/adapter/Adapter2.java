package csii.structural.adapter;

/**
 * 适配器 用来实现目标接口
 * @author xiehai
 * @date 2013-8-9 下午01:31:18 
 */
public class Adapter2 implements Target {
	private Adaptee adaptee;
	/**
	 * Java是单继承的语言，这种类的适配模式往往受到使用环境的限制，
	 * 在面向对象设计原则中，有一条叫做组合/聚合复用原则，
	 * 讲的是尽可能使用组合和聚合达到复用的目的而不是继承，
	 * 所以一般推荐用对象适配器模式达到目的
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
