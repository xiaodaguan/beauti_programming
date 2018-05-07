package cn.guanxiaoda.designpattern.factory.v2;

/**
 * @author guanxiaoda
 * @date 2018/5/7
 */
public class BenzMichelinFactory extends CarFactory {
    @Override
    public ICar manufacture() {
        return new Benz("Ã×ÆäÁÖ");
    }
}
