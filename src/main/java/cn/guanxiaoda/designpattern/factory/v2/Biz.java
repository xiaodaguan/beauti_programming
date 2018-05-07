package cn.guanxiaoda.designpattern.factory.v2;

/**
 * @author guanxiaoda
 * @date 2018/5/7
 */
public class Biz {
    public static void main(String[] args) {
//        ICar benz1 = new Benz("������");
//        ICar benz2 = new Benz("��»��");
//        ICar benz3 = new Benz("����˾ͨ");
//        ICar benz4 = new Benz("������");
//        ICar benz5 = new Benz("�¹�����");
//        ICar benz6 = new Benz("������");
//
//        benz1.drive();
//        benz2.drive();
//        benz3.drive();
//        benz4.drive();
//        benz5.drive();
//        benz6.drive();

        /*
         ҵ��ʹnew Car �����⣬����޸�Benz �Ĺ��췽������Ӧ��ҵ�񷽴��붼Ҫ�޸�
         ���Ӧʹ�ù�������
         */

//        ICar benz1001 = CarFactory.creater("Benz", "ĳ��̥Ʒ��");
//        benz1001.drive();

        /*
        �򵥹�����Ȼ�в�����ĵط��������Ͽ���ԭ���������²�Ʒ���磺BMW������Ҫ�޸�creator
         */

        CarFactory factory1 = new BenzMichelinFactory();
        ICar car1 = factory1.manufacture();

        /*
        ����һ�ֲ�Ʒʱ��ֻ��Ҫ����һ������factory
        */
        CarFactory factory2 = new BenzPirelliFactory();
        ICar car2 = factory2.manufacture();

        car1.drive();
        car2.drive();
    }
}
