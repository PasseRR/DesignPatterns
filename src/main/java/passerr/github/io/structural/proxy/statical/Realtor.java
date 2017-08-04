package passerr.github.io.structural.proxy.statical;

import passerr.github.io.structural.proxy.Renting;

/**
 * 房屋中介
 * @author xiehai1
 * @date 2017/08/04 10:53
 * @Copyright(c) gome inc Gome Co.,LTD
 */
public class Realtor implements Renting {
    private Renting renting;
    public Realtor(Renting renting){
        this.renting = renting;
    }

    @Override
    public String rent() {
        return "realtor in the name of " + this.renting.rent();
    }
}
