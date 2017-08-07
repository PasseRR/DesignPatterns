package passerr.github.io.behavioural.chainofresponsibility;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/08/07 16:44
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Boss extends AbstractHandler {
    public Boss(){
        super();
    }

    public Boss(Handler handler){
        super(handler);
    }

    @Override
    protected String getPosition() {
        return "boss";
    }

    @Override
    protected boolean canApprove(HandleRequest request) {
        // boss只同意1000元及以下金额
        return request.getActivityCapital().compareTo(new BigDecimal("1000")) <= 0;
    }
}
