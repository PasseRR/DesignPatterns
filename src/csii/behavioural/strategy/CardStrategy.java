package csii.behavioural.strategy;

public class CardStrategy implements Strategy {
	@Override
	public double caclCharge(double charge) {
		return charge+charge*CARD;
	}

}
