package passerr.github.io.behavioural.state;

/**
 * @author xiehai1
 * @date 2017/08/24 18:18
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class AfternoonState implements State{
    @Override
    public String coding(Task task) {
        if(task.getTime() > 13 && task.getTime() < 18){
            return String.format(AFTERNOON_STATE, task.getTime());
        }

        task.setState(new EveningState());
        return task.coding();
    }
}
