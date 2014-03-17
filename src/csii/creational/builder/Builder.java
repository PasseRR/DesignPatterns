package csii.creational.builder;

public interface Builder {
	/** 
	 * 组件椅子
	 */
	void builderChaire();
	/** 
	 * 组件底盘
	 */
	void builderChassis();
	/** 
	 * 组件发动机
	 */
	void builderEngine();
	/** 
	 * 组件轮胎
	 */
	void builderTyre();
	/** 
	 * 组件外壳
	 */
	void builderShell();
	/** 
	 * 获得汽车的实例
	 * @return
	 */
	Car getCarInstance();
}
