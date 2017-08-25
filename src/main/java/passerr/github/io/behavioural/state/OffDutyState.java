package passerr.github.io.behavioural.state;

/**
 * 下班状态
 * @author xiehai1
 * @date 2017/08/24 17:52
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class OffDutyState implements State {
    @Override
    public String coding(Task task) {
        return String.format(OFF_DUTY_STATE, task.getTime());
    }
}
