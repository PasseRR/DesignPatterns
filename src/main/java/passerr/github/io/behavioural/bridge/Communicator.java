package passerr.github.io.behavioural.bridge;

/**
 * @author xiehai1
 * @date 2017/07/13 17:03
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public abstract class Communicator {
    Message message;
    public abstract String send();

    public void setMessage(Message message){
        this.message = message;
    }
}
