package cn.guanxiaoda.designpattern.factory.v3;

/**
 * @author guanxiaoda
 * @date 2018/5/7
 */
public class Benz implements ICar {
    private String tyre;

    public Benz(String tyre) {
        this.tyre = tyre;
    }

    @Override
    public void drive() {
        System.out.println("driving benz! [tyre=" + tyre + "]");
    }
}
