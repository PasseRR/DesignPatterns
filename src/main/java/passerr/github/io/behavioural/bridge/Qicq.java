package passerr.github.io.behavioural.bridge;

/**
 * @author xiehai1
 * @date 2017/07/13 17:51
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Qicq extends Communicator {
    @Override
    public String send() {
        return "qicq send " + super.message.getMsg();
    }
}
