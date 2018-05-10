package cn.guanxiaoda.designpattern.proxy;

/**
 * ��̬����
 *
 * @author guanxiaoda
 * @date 2018/5/10
 */
public class LawerA implements ILawsuit {

    /**
     * ����һ�����屻�����ߵ�����
     */
    private ILawsuit person;

    public LawerA() {
        this.person = new PersonA();
    }

    @Override
    public void submit() {
        person.submit();
    }

    @Override
    public void burden() {
        person.burden();
    }

    @Override
    public void defend() {
        person.defend();
    }

    @Override
    public void finish() {
        person.finish();
    }


}
