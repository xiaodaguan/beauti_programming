package cn.guanxiaoda.designpattern.factory.v1;

/**
 * @author guanxiaoda
 * @date 2018/5/7
 */
public class CarFactory {
    public static ICar creater(String carType, String tyre) {
        if ("Benz".equals(carType)) {
            return new Benz(tyre);
        } else if ("Cadillac".equals(carType)) {
            return new Cadillac();
        } else {
            throw new IllegalArgumentException("unknown car type");
        }
    }
}
