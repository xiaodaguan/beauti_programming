package cn.guanxiaoda.entertainment.rollTheBone;

/**
 * Created by gxd on 2017/2/6.
 */
public class Bone {

    private enum Buffs{
        //1: Broadsides, 2: Buried Treasure, 3: Grand Melee, 4: Jolly Roger, 5: Shark Infested Waters, 6: True Bearing
        Broadsides,
        BuriedTreasure,
        GrandMelee,
        JollyRoger,
        SharkInfestedWaters,
        TrueBearing
    }


    public String roll(){


        int random = (int)(Math.random()*6);
        return Buffs.values()[random].name();
    }




    public static void main(String[] args) {

        Bone bone = new Bone();

        for(int i=0;i<10;i++)
         System.out.println(bone.roll());
    }
}
