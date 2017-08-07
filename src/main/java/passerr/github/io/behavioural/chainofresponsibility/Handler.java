package passerr.github.io.behavioural.chainofresponsibility;

/**
 * @author xiehai1
 * @date 2017/08/07 15:24
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public interface Handler {
    HandleResult handle(HandleRequest request);
}
