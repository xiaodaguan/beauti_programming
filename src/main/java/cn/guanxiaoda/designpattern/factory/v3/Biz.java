package cn.guanxiaoda.designpattern.factory.v3;

/**
 * @author guanxiaoda
 * @date 2018/5/7
 */
public class Biz {
    public static void main(String[] args) {

        CarFactory factory1 = new BenzFactory();
        ICar car1 = factory1.manufactureMichelin();
        ICar car2 = factory1.manufacturePirelli();


        car1.drive();
        car2.drive();
        /*
        开闭原则的倾斜性：
            对于新的产品族(Bmw, Cadillac ...) 符合开闭原则
            对于新的产品种类(哪种轮胎) 不符合开闭原则
         */
    }
}
