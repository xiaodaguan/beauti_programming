package cn.guanxiaoda.designpattern.observer;

/**
 * @author guanxiaoda
 * @date 2018/5/8
 */
public interface ISubject {

    void addObserver(IObserver observer);
    void rmObserver(IObserver observer);
    void rmAll();
    void notifyAll(Object data);
    void notify(IObserver observer, Object data);
}
