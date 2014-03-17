package csii.behavioural.state;

public class YellowState implements State {

	@Override
	public void change(Light light) {
		System.out.println("现在是黄灯,请注意!");
		try {
			Thread.sleep(SLEEP_YELLOW);
		} catch (Exception e) {
		}
		light.setState(new GreenState());
	}

}
