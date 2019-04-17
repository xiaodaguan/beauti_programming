package cn.guanxiaoda.lc;

/**
 * Created by guanxiaoda on 15/11/24.
 */
public class NimGame {

    public static boolean canWinNim(int n) {
        if(n%4==0)
            return false;
        else
            return true;
    }

    public static void main(String[] args) {


        System.out.println(canWinNim(8));
    }
}
