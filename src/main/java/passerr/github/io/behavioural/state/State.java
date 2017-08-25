package passerr.github.io.behavioural.state;

/**
 * @author xiehai1
 * @date 2017/08/24 17:44
 * @Copyright(c) gome inc Gome Co.,LTD
 */
interface State {
    String FORENOON_STATE = "%s点正在努力编码!";
    String NOON_STATE = "%s点正在吃饭!";
    String AFTERNOON_STATE = "%s点疲劳的编码!";
    String EVENING_STATE = "%s点疲惫的加班编码!";
    String NIGHT_STATE = "%s点正在睡觉!";
    String OFF_DUTY_STATE = "%s点愉快下班!";
    String coding(Task task);
}
