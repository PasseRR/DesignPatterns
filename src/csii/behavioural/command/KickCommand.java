package csii.behavioural.command;

/**
 * ³öÍÈÃüÁî
 * @author xiehai
 * @date 2013-9-17 ÉÏÎç10:34:59 
 */
public class KickCommand implements Command {
	private GameMachine gm;
	public KickCommand(GameMachine gm){
		this.gm = gm;
	}
	@Override
	public void excute() {
		this.gm.kick();
	}

}
