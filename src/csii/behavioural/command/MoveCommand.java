package csii.behavioural.command;

/**
 * �ƶ�����
 * @author xiehai
 * @date 2013-9-17 ����10:36:06 
 */
public class MoveCommand implements Command{
	private GameMachine gm;
	private String direction;
	
	public MoveCommand(GameMachine gm, String direction){
		super();
		this.gm = gm;
		this.direction = direction;
	}
	
	@Override
	public void excute() {
		this.gm.move(this.direction);
	}

}
