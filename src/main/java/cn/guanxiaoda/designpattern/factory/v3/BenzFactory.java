package cn.guanxiaoda.designpattern.factory.v3;

/**
 * @author guanxiaoda
 * @date 2018/5/7
 */
public class BenzFactory extends CarFactory {

    @Override
    public ICar manufactureMichelin() {
        return new Benz("������");
    }

    @Override
    public ICar manufacturePirelli() {
        return new Benz("������");
    }
}
