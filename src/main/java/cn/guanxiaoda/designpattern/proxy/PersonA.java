package cn.guanxiaoda.designpattern.proxy;

/**
 * �������
 * @author guanxiaoda
 * @date 2018/5/10
 */


public class PersonA implements ILawsuit{
    @Override
    public void submit() {
        System.out.println(getClass().getSimpleName()+"�ύ�ٲ�����");
    }

    @Override
    public void burden() {
        System.out.println(getClass().getSimpleName()+"���о�֤");
    }

    @Override
    public void defend() {
        System.out.println(getClass().getSimpleName()+"���б绤");
    }

    @Override
    public void finish() {
        System.out.println(getClass().getSimpleName()+"���ϳɹ�");
    }


}
