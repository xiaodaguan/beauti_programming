package cn.guanxiaoda.designpattern;

import static java.lang.System.out;

interface IProgrammer {
    void skills();
}

/**
 * @author guanxiaoda
 * @date 2018/5/4
 */


public class Decorator {

    public static void main(String[] args) {
        //������
        IProgrammer java = new JavaProgrammer();
        // ����װ����(����װ����(������))
        IProgrammer gxd = new AliCoder(new MeituanCoder(java));
        IProgrammer bl = new AliCoder(new DecorateProgrammer(() -> out.println("full stack,")));
        gxd.skills();
        //java,
        //mtthrift,
        //dubbo,
        out.println("***");
        bl.skills();
        //full stack,
        //dubbo,
    }


}

/**
 * ������1
 */
class JavaProgrammer implements IProgrammer {

    @Override
    public void skills() {
        out.println("java,");
    }
}

/**
 * ������2
 */
class CProgrammer implements IProgrammer {

    @Override
    public void skills() {
        out.println("c,");
    }
}

/**
 * ������3
 */
class PythonProgrammer implements IProgrammer {

    @Override
    public void skills() {
        out.println("python,");
    }
}

/**
 * װ����
 */
class DecorateProgrammer implements IProgrammer {

    private IProgrammer programmer;

    DecorateProgrammer(IProgrammer programmer) {
        this.programmer = programmer;
    }

    @Override
    public void skills() {
        programmer.skills();
    }
}

/**
 * ����װ����1
 */
class MeituanCoder extends DecorateProgrammer {

    MeituanCoder(IProgrammer programmer) {
        super(programmer);
    }

    @Override
    public void skills() {
        super.skills();
        out.println("mtthrift,");
    }
}

/**
 * ����װ����1
 */
class AliCoder extends DecorateProgrammer {

    AliCoder(IProgrammer programmer) {
        super(programmer);
    }

    @Override
    public void skills() {
        super.skills();
        out.println("dubbo,");
    }
}