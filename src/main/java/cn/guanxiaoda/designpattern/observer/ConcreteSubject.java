package cn.guanxiaoda.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guanxiaoda
 * @date 2018/5/8
 */
public class ConcreteSubject implements ISubject {

    List<IObserver> mList = new ArrayList<>();

    @Override
    public void addObserver(IObserver observer) {
        // 确保相同的观察者只含有一个
        if (observer == null) {
            throw new NullPointerException("observer == null");
        }
        if (!mList.contains(observer)) {
            mList.add(observer);
        }
    }

    @Override
    public void rmObserver(IObserver observer) {
        mList.remove(observer);
    }

    @Override
    public void rmAll() {
        mList.clear();
    }

    @Override
    public void notifyAll(Object data) {
        for (IObserver observer : mList) {
            observer.update(this, data);
        }
    }

    @Override
    public void notify(IObserver observer, Object data) {
        if (observer != null) {
            observer.update(this, data);
        }
    }
}
