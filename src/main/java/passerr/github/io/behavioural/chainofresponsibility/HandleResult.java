package passerr.github.io.behavioural.chainofresponsibility;

import lombok.Builder;
import lombok.Data;

/**
 * 处理结果
 * @author xiehai1
 * @date 2017/08/07 15:22
 * @Copyright(c) gome inc Gome Co.,LTD
 */
@Data
@Builder
public class HandleResult {
    private Boolean isOk;
    private String from;
    private String result;

    public static HandleResult ok(String from, String result){
        return HandleResult.builder()
            .isOk(Boolean.TRUE)
            .from(from)
            .result(result)
            .build();
    }

    public static HandleResult reject(String from, String result){
        return HandleResult.builder()
            .isOk(Boolean.FALSE)
            .from(from)
            .result(result)
            .build();
    }
}
