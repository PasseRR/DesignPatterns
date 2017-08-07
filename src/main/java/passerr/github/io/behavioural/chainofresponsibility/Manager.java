package passerr.github.io.behavioural.chainofresponsibility;

import java.math.BigDecimal;

/**
 * @author xiehai1
 * @date 2017/08/07 16:32
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Manager extends AbstractHandler {
    public Manager(){
        super();
    }

    public Manager(Handler handler){
        super(handler);
    }

    @Override
    protected String getPosition() {
        return "manager";
    }

    @Override
    protected boolean canApprove(HandleRequest request) {
        // manager只能审批500元及以下的金额
        return request.getActivityCapital().compareTo(new BigDecimal("500")) <= 0;
    }
}
