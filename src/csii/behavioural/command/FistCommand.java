package csii.behavioural.command;

/**
 * ³öÈ­ÃüÁî
 * @author xiehai
 * @date 2013-9-17 ÉÏÎç10:34:29 
 */
public class FistCommand implements Command {
	private GameMachine gm;
	public FistCommand(GameMachine gm){
		super();
		this.gm = gm;
	}
	@Override
	public void excute() {
		this.gm.fist();
	}

}
