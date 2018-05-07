package cn.guanxiaoda.designpattern.factory.v3.v2;

/**
 * @author guanxiaoda
 * @date 2018/5/7
 */
public class BenzFactory extends CarFactory {

    @Override
    public ICar manufactureMichelin() {
        return new Benz("米其林");
    }

    @Override
    public ICar manufacturePirelli() {
        return new Benz("倍耐力");
    }
}
