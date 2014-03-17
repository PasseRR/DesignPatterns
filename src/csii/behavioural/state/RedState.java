package csii.behavioural.state;

public class RedState implements State {

	@Override
	public void change(Light light) {
		System.out.println("�����Ǻ��,��ֹͨ��!");
		try {
			Thread.sleep(SLEEP_RED);
		} catch (Exception e) {
		}
		light.setState(new YellowState());
	}

}
