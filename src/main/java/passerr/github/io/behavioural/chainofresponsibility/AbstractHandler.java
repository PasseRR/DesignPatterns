package passerr.github.io.behavioural.chainofresponsibility;

import lombok.Getter;

/**
 * @author xiehai1
 * @date 2017/08/07 15:27
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public abstract class AbstractHandler implements Handler {
    @Getter
    private Handler superior;

    public AbstractHandler() {

    }

    public AbstractHandler(Handler superior) {
        this.superior = superior;
    }

    /**
     * 职位名称
     * @return 职位名称
     */
    protected abstract String getPosition();

    /**
     * 当前是否能审批
     * @param request 请求
     * @return true/能 false/不能
     */
    protected abstract boolean canApprove(HandleRequest request);

    @Override
    public HandleResult handle(HandleRequest request) {
        if (this.canApprove(request)) {
            return HandleResult.ok(this.getPosition(), request.getActivityTheme() + " ok");
        }

        return this.superior != null
            ? this.superior.handle(request)
            : HandleResult.reject(this.getPosition(), request.getActivityTheme() + " reject");
    }
}
