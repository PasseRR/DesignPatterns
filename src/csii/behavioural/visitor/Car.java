package csii.behavioural.visitor;

public class Car implements Visitable {
	private Engine engine;
	private Body body;
	private Wheel wheel;
	public Car(){
		
	}
	public Car(Engine engine, Body body, Wheel wheel){
		this.engine = engine;
		this.body = body;
		this.wheel = wheel;
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		this.body.accept(visitor);
		this.engine.accept(visitor);
		this.wheel.accept(visitor);
	}
}
