package passerr.github.io.behavioural.state;

/**
 * @author xiehai1
 * @date 2017/08/24 18:02
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class NoonState implements State {
    @Override
    public String coding(Task task) {
        if(task.getTime() >= 12 && task.getTime() <= 13){
            return String.format(NOON_STATE, task.getTime());
        }

        task.setState(new AfternoonState());
        return task.coding();
    }
}
