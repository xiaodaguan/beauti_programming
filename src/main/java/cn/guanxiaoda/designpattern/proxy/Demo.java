package cn.guanxiaoda.designpattern.proxy;

/**
 * @author guanxiaoda
 * @date 2018/5/10
 */
public class Demo {

    public static void main(String[] args) {
        /**
         * ��̬����
         */
        //����һ��Ҫ���ϵĹ���
        PersonA personA = new PersonA();
        //�����ҵ���ʦ
        ILawsuit lawerA = new LawerA();
        //��ʦ��ȫ�������ϵ���������
        System.out.println("***��̬����");
        lawerA.submit();
        lawerA.burden();
        lawerA.defend();
        lawerA.finish();

        /**
         * ��̬����
         */

        System.out.println("***��̬����");
        LawerFactory factory = new LawerFactory(personA,
                () -> System.out.println("�����ӵ�����ȥ��Ժ"),
                () -> System.out.println("�����͵����˻ؼ�"));
        ILawsuit lawer = (ILawsuit) factory.createProxy();
        lawer.submit();
        lawer.burden();
        lawer.defend();
        lawer.finish();
    }


}
