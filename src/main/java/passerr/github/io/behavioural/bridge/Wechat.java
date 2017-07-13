package passerr.github.io.behavioural.bridge;

/**
 * @author xiehai1
 * @date 2017/07/13 17:49
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Wechat extends Communicator {
    @Override
    public String send() {
        return "wechat send " + super.message.getMsg();
    }
}
