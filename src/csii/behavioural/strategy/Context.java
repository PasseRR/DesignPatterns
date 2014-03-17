package csii.behavioural.strategy;

public class Context {
	private Strategy strategy;

	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public double caclCharge(double charge, ChargeType type){
		this.strategy = StrategyFactory.getInstance().creator(type);
		return this.strategy.caclCharge(charge);
	}
}
