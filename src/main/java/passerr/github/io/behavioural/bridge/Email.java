package passerr.github.io.behavioural.bridge;

/**
 * @author xiehai1
 * @date 2017/07/13 17:51
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Email extends Communicator {
    @Override
    public String send() {
        return "email send " + super.message.getMsg();
    }
}
