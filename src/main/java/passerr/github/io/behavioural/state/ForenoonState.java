package passerr.github.io.behavioural.state;

/**
 * @author xiehai1
 * @date 2017/08/24 18:01
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class ForenoonState implements State {
    @Override
    public String coding(Task task) {
        if(task.getTime() < 9){
            task.setState(new NightState());
            return task.coding();
        }

        if(task.getTime() < 12){
            return String.format(FORENOON_STATE, task.getTime());
        }

        task.setState(new NoonState());
        return task.coding();
    }
}
