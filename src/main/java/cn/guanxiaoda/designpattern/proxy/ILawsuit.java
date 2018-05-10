package cn.guanxiaoda.designpattern.proxy;

/**
 * 诉讼流程
 * @author guanxiaoda
 * @date 2018/5/10
 */
public interface ILawsuit {
    //提交申请
    void submit();
    //进行举证
    void burden();
    //开始辩护
    void defend();
    //诉讼完成
    void finish();

}
