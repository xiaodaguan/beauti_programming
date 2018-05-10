package cn.guanxiaoda.designpattern.proxy;

/**
 * 被代理的
 * @author guanxiaoda
 * @date 2018/5/10
 */


public class PersonB implements ILawsuit{
    @Override
    public void submit() {
        System.out.println(getClass().getSimpleName()+"提交仲裁申请");
    }

    @Override
    public void burden() {
        System.out.println(getClass().getSimpleName()+"进行举证");
    }

    @Override
    public void defend() {
        System.out.println(getClass().getSimpleName()+"进行辩护");
    }

    @Override
    public void finish() {
        System.out.println(getClass().getSimpleName()+"诉讼成功");
    }


}
