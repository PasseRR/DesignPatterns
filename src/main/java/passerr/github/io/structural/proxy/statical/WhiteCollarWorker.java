package passerr.github.io.structural.proxy.statical;

import passerr.github.io.structural.proxy.Renting;

/**
 * @author xiehai1
 * @date 2017/08/04 10:52
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class WhiteCollarWorker implements Renting {
    @Override
    public String rent() {
        return "white collar worker rent";
    }
}
