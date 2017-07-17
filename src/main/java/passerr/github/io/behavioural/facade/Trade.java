package passerr.github.io.behavioural.facade;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author xiehai1
 * @date 2017/07/14 17:43
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Data
@Builder
public class Trade {
    private BigInteger userId;
    private BigDecimal points;
    private BigDecimal cash;
    private BigDecimal consumeCash;
    private BigDecimal awardPoints;
}
