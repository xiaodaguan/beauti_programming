package cn.guanxiaoda.designpattern.proxy;

/**
 * 静态代理
 *
 * @author guanxiaoda
 * @date 2018/5/10
 */
public class LawerA implements ILawsuit {

    /**
     * 持有一个具体被代理者的引用
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
