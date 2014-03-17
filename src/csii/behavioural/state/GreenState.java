package csii.behavioural.state;

public class GreenState implements State {

	@Override
	public void change(Light light) {
		System.out.println("现在是绿灯,可以通行!");
		try{
			Thread.sleep(SLEEP_GREEN);
		}catch(Exception e){
		}
		light.setState(new RedState());
	}

}
