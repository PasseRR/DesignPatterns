package passerr.github.io.behavioural.interpreter;

import lombok.Getter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 计算器<BR/>
 * <p>
 * 给定计算算式只能包含+、-、*、/、%、(、)、.、数字
 * 运算符均为双目运算符 其中优先级由高到低如下
 * </p>
 * <ul>
 * <li>()</li>
 * <li>*、/、%</li>
 * <li>+、-</li>
 * </ul>
 * @author xiehai1
 * @date 2017/08/08 18:01
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Calculator {
    @Getter
    private String expression;
    private static final String EXPRESSION_REG = "^(\\(*\\d+(.\\d+)*\\)*(\\+|-|/|\\*|%))+\\d+(.\\d+)*\\)*$";

    public Calculator(String expression) {
        this.expression = expression;
    }

    /**
     * 简单校验是否是合法的算式
     * @return true/false
     */
    private boolean isValid() {
        Pattern pattern = Pattern.compile(EXPRESSION_REG);
        Matcher matcher = pattern.matcher(this.expression);

        return matcher.matches();
    }

    /**
     * 通过计算算式计算结果
     * @return {@link CalculateResult}计算结果
     */
    public CalculateResult calculate() {
        if (!this.isValid()) {
            return CalculateResult.invalid();
        }

        return CalculateResult.valid(CalculateHelper.calculate(this.expression));
    }
}
