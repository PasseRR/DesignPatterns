package csii.creational.builder;

public class CarMarket {
	private Builder builder;
	public CarMarket() {
		// TODO Auto-generated constructor stub
	}
	public CarMarket(Builder builder){
		this.builder = builder;
	}
	public Builder getBuilder() {
		return builder;
	}
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	/** 
	 * 客户提车
	 * @return
	 */
	public Car getCar(){
		builder.builderChaire();
		builder.builderChassis();
		builder.builderEngine();
		builder.builderShell();
		builder.builderTyre();
		
		return builder.getCarInstance();
	}
}
