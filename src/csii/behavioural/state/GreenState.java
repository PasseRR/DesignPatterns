package csii.behavioural.state;

public class GreenState implements State {

	@Override
	public void change(Light light) {
		System.out.println("�������̵�,����ͨ��!");
		try{
			Thread.sleep(SLEEP_GREEN);
		}catch(Exception e){
		}
		light.setState(new RedState());
	}

}
