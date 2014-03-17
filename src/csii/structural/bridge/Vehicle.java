package csii.structural.bridge;

/**
 * 车的抽象类
 * @author xiehai
 * @date 2013-9-16 上午11:24:03 
 */
public abstract class Vehicle {
	private Transport transport;

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}
	
	public void transport(){
		this.transport.transport();
	}
}
