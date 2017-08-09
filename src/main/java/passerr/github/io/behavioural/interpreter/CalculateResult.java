package passerr.github.io.behavioural.interpreter;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

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

    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1);
        BigDecimal b = new BigDecimal(3);
        BigDecimal c = a.divide(b, new MathContext(5, RoundingMode.HALF_UP));

        System.out.println(c.toString());
    }
}
