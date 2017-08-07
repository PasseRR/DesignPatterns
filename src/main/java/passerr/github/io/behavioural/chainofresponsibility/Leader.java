package passerr.github.io.behavioural.chainofresponsibility;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/08/07 15:30
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Leader extends AbstractHandler {
    public Leader(){
        super();
    }

    public Leader(Handler handler){
        super(handler);
    }
    @Override
    protected String getPosition() {
        return "leader";
    }
    @Override
    protected boolean canApprove(HandleRequest request) {
        // leader只能审批100元及以下的金额
        return request.getActivityCapital().compareTo(new BigDecimal("100")) <= 0;
    }
}
