package csii.behavioural.command;

/**
 * ��ȭ����
 * @author xiehai
 * @date 2013-9-17 ����10:34:29 
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
