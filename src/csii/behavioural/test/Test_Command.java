package csii.behavioural.test;

import csii.behavioural.command.Controller;
import csii.behavioural.command.FistCommand;
import csii.behavioural.command.GameMachine;
import csii.behavioural.command.KickCommand;
import csii.behavioural.command.MoveCommand;

/**
 * ����ģʽ����
 * @author xiehai
 * @date 2013-9-17 ����10:43:01 
 */
public class Test_Command {
	public static void main(String[] args) {
		GameMachine gm = new GameMachine();
		FistCommand fc = new FistCommand(gm);
		KickCommand kc = new KickCommand(gm);
		MoveCommand mc = new MoveCommand(gm, "ǰ");
		
		Controller c = new Controller(fc, kc, mc);
		c.fist();
		c.kick();
		c.move();
	}
}
