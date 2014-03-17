package csii.behavioural.chainofresponsibility;

/**
 * 组长
 * @author xiehai
 * @date 2013-9-17 上午09:32:17 
 */
public class GroupLeader extends Handler {

	@Override
	public void check(int day) {
		if(day < GROUP_LEADER){
			System.out.println("组长审批通过!");
		}else{
			System.out.println("组长上报给了他的上司!");
			getHandler().check(day);
		}
	}

}
