package cn.guanxiaoda.designpattern.observer;

/**
 * @author guanxiaoda
 * @date 2018/5/8
 */
public interface IObserver {

    void update(ISubject subject, Object data);
}
