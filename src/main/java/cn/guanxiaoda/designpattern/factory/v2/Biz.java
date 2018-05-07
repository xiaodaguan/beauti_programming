package cn.guanxiaoda.designpattern.factory.v2;

/**
 * @author guanxiaoda
 * @date 2018/5/7
 */
public class Biz {
    public static void main(String[] args) {
//        ICar benz1 = new Benz("米其林");
//        ICar benz2 = new Benz("邓禄普");
//        ICar benz3 = new Benz("普利司通");
//        ICar benz4 = new Benz("固特异");
//        ICar benz5 = new Benz("德国马牌");
//        ICar benz6 = new Benz("倍耐力");
//
//        benz1.drive();
//        benz2.drive();
//        benz3.drive();
//        benz4.drive();
//        benz5.drive();
//        benz6.drive();

        /*
         业务方使new Car 的问题，如果修改Benz 的构造方法，对应的业务方代码都要修改
         因此应使用工厂方法
         */

//        ICar benz1001 = CarFactory.creater("Benz", "某轮胎品牌");
//        benz1001.drive();

        /*
        简单工厂依然有不合理的地方：不符合开闭原则，如果添加新产品（如：BMW），需要修改creator
         */

        CarFactory factory1 = new BenzMichelinFactory();
        ICar car1 = factory1.manufacture();

        /*
        新增一种产品时，只需要新增一个具体factory
        */
        CarFactory factory2 = new BenzPirelliFactory();
        ICar car2 = factory2.manufacture();

        car1.drive();
        car2.drive();
    }
}
