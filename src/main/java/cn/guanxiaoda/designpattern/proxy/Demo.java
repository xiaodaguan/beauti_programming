package cn.guanxiaoda.designpattern.proxy;

/**
 * @author guanxiaoda
 * @date 2018/5/10
 */
public class Demo {

    public static void main(String[] args) {
        /**
         * 静态代理
         */
        //构造一个要诉讼的公民
        PersonA personA = new PersonA();
        //公民找到律师
        ILawsuit lawerA = new LawerA();
        //律师完全代理诉讼的整个过程
        System.out.println("***静态代理");
        lawerA.submit();
        lawerA.burden();
        lawerA.defend();
        lawerA.finish();

        /**
         * 动态代理
         */

        System.out.println("***动态代理");
        LawerFactory factory = new LawerFactory(personA,
                () -> System.out.println("开车接当事人去法院"),
                () -> System.out.println("开车送当事人回家"));
        ILawsuit lawer = (ILawsuit) factory.createProxy();
        lawer.submit();
        lawer.burden();
        lawer.defend();
        lawer.finish();
    }


}
