package csii.behavioural.command;

/**
 * ¿ØÖÆÆ÷
 * @author xiehai
 * @date 2013-9-17 ÉÏÎç10:38:40 
 */
public class Controller {
	private Command fistCommand;
	private Command kickCommand;
	private Command moveCommand;
	
	public Controller(Command fist, Command kick, Command move){
		super();
		this.kickCommand = kick;
		this.fistCommand = fist;
		this.moveCommand = move;
	}
	
	public void fist(){
		this.fistCommand.excute();
	}
	
	public void kick(){
		this.kickCommand.excute();
	}
	
	public void move(){
		this.moveCommand.excute();
	}
}
