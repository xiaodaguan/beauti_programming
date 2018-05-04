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
        IProgrammer java = new JavaProgrammer();
        IProgrammer gxd = new AliCoder(new MeituanCoder(java));

        gxd.skills();
        //java,
        //mtthrift,
        //dubbo,
    }


}

class JavaProgrammer implements IProgrammer {

    @Override
    public void skills() {
        out.println("java,");
    }
}

class CProgrammer implements IProgrammer {

    @Override
    public void skills() {
        out.println("c,");
    }
}

class PythonProgrammer implements IProgrammer {

    @Override
    public void skills() {
        out.println("python,");
    }
}

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