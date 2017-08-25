package passerr.github.io.behavioural.state;

/**
 * @author xiehai1
 * @date 2017/08/24 18:24
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class NightState implements State {
    @Override
    public String coding(Task task) {
        return String.format(NIGHT_STATE, task.getTime());
    }
}
