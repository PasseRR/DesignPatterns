package csii.behavioural.state;

public class YellowState implements State {

	@Override
	public void change(Light light) {
		System.out.println("�����ǻƵ�,��ע��!");
		try {
			Thread.sleep(SLEEP_YELLOW);
		} catch (Exception e) {
		}
		light.setState(new GreenState());
	}

}
