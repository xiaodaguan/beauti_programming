package cn.guanxiaoda.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

interface BeforeAdvice {
    //前置增强方法
    public void before();
}

interface AfterAdvice {
    //后置增强方法
    public void after();
}

interface Target {
    //目标方法
    public void targetMethod();
}

/**
 * @author guanxiaoda
 * @date 2018/5/10
 */
public class LawerFactory {


    private Object targetObject;// 目标对象
    private BeforeAdvice beforeAdvice;// 前置增强
    private AfterAdvice afterAdvice;// 后置增强


    public LawerFactory(Object targetObject, BeforeAdvice beforeAdvice, AfterAdvice afterAdvice) {
        super();
        this.targetObject = targetObject;
        this.beforeAdvice = beforeAdvice;
        this.afterAdvice = afterAdvice;
    }

    public Object createProxy() {
        ClassLoader loader = this.getClass().getClassLoader();
        Class[] interfaces = targetObject.getClass().getInterfaces();
        InvocationHandler h = (proxy, method, args) -> {
            if (beforeAdvice != null) {
                System.out.print(method.getName());
                beforeAdvice.before();
            }
            Object result = method.invoke(targetObject, args);
            if (afterAdvice != null) {
                System.out.print(method.getName());
                afterAdvice.after();
            }

            return result;
        };
        Object object = Proxy.newProxyInstance(loader, interfaces, h);
        return object;
    }

}
