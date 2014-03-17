package csii.behavioural.state;

public class RedState implements State {

	@Override
	public void change(Light light) {
		System.out.println("现在是红灯,禁止通行!");
		try {
			Thread.sleep(SLEEP_RED);
		} catch (Exception e) {
		}
		light.setState(new YellowState());
	}

}
