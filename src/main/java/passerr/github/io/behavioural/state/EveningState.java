package passerr.github.io.behavioural.state;

/**
 * @author xiehai1
 * @date 2017/08/24 18:21
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class EveningState implements State {
    @Override
    public String coding(Task task) {
        if(task.getTime() >= 18 && task.getTime() <= 22){
            return String.format(EVENING_STATE, task.getTime());
        }

        task.setState(new NightState());
        return task.coding();
    }
}
