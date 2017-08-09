package passerr.github.io.behavioural.interpreter;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author xiehai1
 * @date 2017/08/09 15:28
 * @Copyright(c) gome inc Gome Co.,LTD
 */
final class CalculateHelper {
    private static final String LEFT_BRACKET = "(";
    private static final String RIGHT_BRACKET = ")";
    private static final String PLUS = "+";
    private static final String MINUS = "-";
    private static final String MULTIPLY = "*";
    private static final String DIVIDE = "/";
    private static final String REMAINDER = "%";
    private static final String POINT = ".";

    private CalculateHelper() {

    }

    static BigDecimal calculate(String expression) {
        Stack<String> order = convertInOrder2PostOrder(expression);
        return calc(order);
    }

    /**
     * <p>
     * 首先维护的是两个栈，我们这里暂且称为S1和S2，S1中的结果最后存的就是逆波兰表达式，
     * S2中将用于暂时存放运算符并且在最终形成逆波兰表达式的时候，该栈是会清空的。
     * </p>
     * <ol>
     * <li>
     * 如果遇到的是数字，我们直接加入到栈S1中；
     * </li>
     * <li>
     * 如果遇到的是左括号，则直接将该左括号加入到栈S2中；
     * </li>
     * <li>
     * 如果遇到的是右括号，那么将栈S2中的运算符一次出栈加入到栈S1中，直到遇到左括号，
     * 但是该左括号出栈S2并不加入到栈S1中；
     * </li>
     * <li>
     * 如果遇到的是运算符，包括单目运算符和双目运算符，我们按照下面的规则进行操作：
     * <ol>
     * <li>
     * 如果此时栈S2为空，则直接将运算符加入到栈S2中；
     * </li>
     * <li>
     * 如果此时栈S2不为空，当前遍历的运算符的优先级大于等于栈顶运算符的优先级，那么直接入栈S2；
     * </li>
     * <li>
     * 如果此时栈S2不为空，当前遍历的运算符的优先级小于栈顶运算符的优先级，则将栈顶运算符一直出栈加入到栈S1中，
     * 直到栈为空或者遇到一个运算符的优先级小于等于当前遍历的运算符的优先级 此时将该运算符加入到栈S2中；
     * </li>
     * </ol>
     * </li>
     * <li>
     * 直到遍历完整个中序表达式之后，栈S2中仍然存在运算符，那么将这些运算符依次出栈加入到栈S1中，直到栈为空。
     * </li>
     * </ol>
     * @param expression 算式字符串
     */
    private static Stack<String> convertInOrder2PostOrder(String expression) {
        Stack<String> order = new Stack<>();
        Stack<String> temp = new Stack<>();
        for (int i = 0, len = expression.length(); i < len; i++) {
            StringBuilder sb = new StringBuilder();
            String word = expression.substring(i, i + 1);
            if (isDigit(word)) {
                sb.append(word);
                for (int j = i + 1; j < len; j++) {
                    word = expression.substring(j, j + 1);
                    if (isDigit(word)) {
                        sb.append(word);
                        if (j == len - 1) {
                            i = len - 1;
                            break;
                        }
                    } else {
                        i = j - 1;
                        break;
                    }
                }

                order.push(sb.toString());
            } else if (LEFT_BRACKET.equals(word)) {
                temp.push(word);
            } else if (RIGHT_BRACKET.equals(word)) {
                while (temp.size() > 0) {
                    String top = temp.pop();
                    if (LEFT_BRACKET.equals(top)) {
                        break;
                    }

                    order.push(top);
                }
            } else { // + - * / %
                if (temp.isEmpty()) {
                    temp.push(word);
                } else {
                    String top = temp.peek();
                    if (compareTo(word, top) >= 0) {
                        temp.push(word);
                    } else {
                        while (temp.size() > 0) {
                            top = temp.peek();
                            if (compareTo(word, top) < 0) {
                                if(!LEFT_BRACKET.equals(top)){
                                    order.push(top);
                                }
                            } else {
                                temp.push(word);
                                break;
                            }

                            temp.pop();
                        }
                    }
                }
            }
        }

        if (!temp.isEmpty()) {
            order.addAll(temp);
        }


        return order;
    }

    /**
     * <p>
     * 我们此时维护一个数据结果栈S3，我们将会看到该栈中最后存放的是最终的表达式的值。
     * 我们从左至右的遍历栈S1，然后按照下面的规则进行操作栈S3.
     * </p>
     * <ol>
     * <li>
     * 如果遇到的是数字，那么直接将数字压入到S3中
     * </li>
     * <li>
     * 如果遇到的是单目运算符，那么取S3栈顶的一个元素进行单目运算之后，将结果再次压入到栈S3中；
     * </li>
     * <li>
     * 如果遇到的是双目运算符，那么取S3栈顶的两个元素进行，首先出栈的在左，后出栈的在右进行双目运算符的计算，将结果再次压入到S3中。
     * </li>
     * </ol>
     * @param order
     * @return
     */
    private static BigDecimal calc(Stack<String> order) {
        LinkedList<String> copyOrder = new LinkedList<>(order);
        Stack<String> temp = new Stack<>();
        while (copyOrder.size() > 0) {
            String top = copyOrder.pollFirst();
            if (isOperator(top)) {
                String second = temp.pop();
                String first = temp.pop();
                temp.push(calc(first, second, top).toString());
            } else {
                temp.push(top);
            }
        }

        return new BigDecimal(temp.pop());
    }

    private static BigDecimal calc(String first, String second, String operator) {
        BigDecimal a = new BigDecimal(first);
        BigDecimal b = new BigDecimal(second);
        if(PLUS.equals(operator)){
            return a.add(b);
        }else if(MINUS.equals(operator)){
            return a.subtract(b);
        }else if(MULTIPLY.equals(operator)){
            return a.multiply(b);
        }else if(DIVIDE.equals(operator)){
            return a.divide(b);
        }else if(REMAINDER.equals(operator)){
            return a.remainder(b);
        }
        return null;
    }

    /**
     * 是否是数字和小数点
     * @param word 长度为1的字符串
     * @return true/false
     */
    private static boolean isDigit(String word) {
        char c = word.toCharArray()[0];
        return POINT.equals("" + c) || Character.isDigit(c);
    }

    /**
     * 是否是运算符(+ - * / %)
     * @param word 长度为1的字符串
     * @return true/false
     */
    private static boolean isOperator(String word) {
        return PLUS.equals(word)
            || MINUS.equals(word)
            || MULTIPLY.equals(word)
            || DIVIDE.equals(word)
            || REMAINDER.equals(word);
    }

    /**
     * 比较操作符优先级
     * @param operator1 运算符1
     * @param operator2 运算符2
     * @return >0运算符1优先级大于运算符2 0优先级相同 <0运算符1优先级小于运算符2
     */
    private static int compareTo(String operator1, String operator2) {
        return getPriority(operator1) - getPriority(operator2);
    }

    /**
     * 运算符优先级等级
     * @param operator 运算符
     * @return 1 0 -1
     */
    private static int getPriority(String operator) {
        if (LEFT_BRACKET.equals(operator) || RIGHT_BRACKET.equals(operator)) {
            // ( )
            return 1;
        } else if (PLUS.equals(operator) || MINUS.equals(operator)) {
            // + -
            return -1;
        } else {
            // * / %
            return 0;
        }
    }
}
