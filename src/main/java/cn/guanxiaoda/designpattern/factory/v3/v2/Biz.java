package cn.guanxiaoda.designpattern.factory.v3.v2;

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
        ����ԭ�����б�ԣ�
            �����µĲ�Ʒ��(Bmw, Cadillac ...) ���Ͽ���ԭ��
            �����µĲ�Ʒ����(������̥) �����Ͽ���ԭ��
         */
    }
}
