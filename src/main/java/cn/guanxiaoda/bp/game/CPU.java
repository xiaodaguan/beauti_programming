package cn.guanxiaoda.bp.game;

/**
 * Created by guanxiaoda on 9/21/15.
 * not finished. 2015-09-21 13:56:21
 */
public class CPU {

    private static boolean busy = false;

    public static void main(String[] args) {
        ThreadGroup group = new ThreadGroup("myThreads");
        new Thread(group, CPU::workOrRest, "thread1").start();
        new Thread(group, CPU::workOrRest, "thread2").start();
        new Thread(group, CPU::workOrRest, "thread3").start();
        new Thread(group, CPU::workOrRest, "thread4").start();
    }

    private static void workOrRest() {
        int i = 0;
        while (true) {
            if (!busy) {
                i++;
            } else {
                ;
            }
        }
    }

}
