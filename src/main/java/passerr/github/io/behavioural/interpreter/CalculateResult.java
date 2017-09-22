package passerr.github.io.behavioural.interpreter;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 计算结果
 * @author xiehai1
 * @date 2017/08/08 17:48
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Data
@Builder
public class CalculateResult {
    private boolean isValid;
    private BigDecimal result;

    public static CalculateResult invalid() {
        return CalculateResult.builder()
            .isValid(false)
            .build();
    }

    public static CalculateResult valid(BigDecimal result) {
        return CalculateResult.builder()
            .isValid(true)
            .result(result)
            .build();
    }
}
