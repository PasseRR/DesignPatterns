package csii.behavioural.observer;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * ¾¯²ì
 * @author xiehai
 * @date 2013-9-16 ÏÂÎç05:34:07 
 */
public class Police extends Observable {
	private String time;
	
	public Police(){
		
	}
	
	public Police(List<Observer> list){
		for(Observer ob : list){
			this.addObserver(ob);
		}
	}
	
	public void changeTime(String time){
		this.time = time;
		this.setChanged();
		this.notifyObservers(this.time);
	}
}
