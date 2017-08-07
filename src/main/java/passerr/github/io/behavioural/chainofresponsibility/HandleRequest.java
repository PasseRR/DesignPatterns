package passerr.github.io.behavioural.chainofresponsibility;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 客户端请求
 * @author xiehai1
 * @date 2017/08/07 15:23
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Data
public class HandleRequest {
    /**
     * 活动主体
     */
    private String activityTheme;
    /**
     * 申请活动资金
     */
    private BigDecimal activityCapital;
}
