package csii.behavioural.command;

/**
 * 游戏机
 * @author xiehai
 * @date 2013-9-17 上午10:31:02 
 */
public class GameMachine {
	/** 
	 * 出拳
	 */
	public void fist(){
		System.out.println("游戏角色出拳!");
	}
	
	/** 
	 * 出腿
	 */
	public void kick(){
		System.out.println("游戏角色出腿!");
	}
	
	/** 
	 * 移动
	 * @param direction 方向
	 */
	public void move(String direction){
		System.out.println("游戏角色向" + direction + "移动");
	}
}
