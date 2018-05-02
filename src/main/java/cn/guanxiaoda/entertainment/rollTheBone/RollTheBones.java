package cn.guanxiaoda.entertainment.rollTheBone;

import java.util.*;

/**
 * Created by gxd on 2017/2/6.
 */
public class RollTheBones {

    public static void main(String[] args) {
        RollTheBones rtb = new RollTheBones();
        HashMap<Integer,Integer> buffCountStat = new HashMap<Integer, Integer>();
        HashMap<String, Integer> buffContainStat = new HashMap<String, Integer>();

        int iterations = 10000*10000;
        for(int i=0;i<iterations;i++){
            List<String > buffs =  rtb.rollTheBones();
            int buffCount = buffs.size();
            if(buffCountStat.containsKey(buffCount)){
                buffCountStat.put(buffCount,buffCountStat.get(buffCount)+1);
            }else{
                buffCountStat.put(buffCount,1);
            }

           for(String buff:buffs){
               if(buffContainStat.containsKey(buff)){
                   buffContainStat.put(buff,buffContainStat.get(buff)+1);
               }else{
                   buffContainStat.put(buff,1);
               }
           }

        }

        System.out.println("buff 数量：");
        for(int count:buffCountStat.keySet()){
            System.out.println(count + " buff 次数： "+ buffCountStat.get(count)+ ", 比例： "+ 100*((double)buffCountStat.get(count)/iterations)+"%");
        }
        System.out.println("特定buff获取：");
        for(String buff:buffContainStat.keySet()){
            System.out.println("roll 到["+buff+"] 的次数： "+ buffContainStat.get(buff)+", 比例： " + 100*((double)buffContainStat.get(buff)/iterations));
        }


    }

    public List<String> rollTheBones(){
        ArrayList<String> buffs = new ArrayList<String>();

        HashMap<String, Integer> buffCount = new HashMap<String, Integer>();
        for(int i=0;i<6;i++){
            String buff = new Bone().roll();
            if(buffCount.containsKey(buff)){
                buffCount.put(buff,buffCount.get(buff)+1);
            }else{
                buffCount.put(buff,1);
            }

        }

        List<Map.Entry<String,Integer>> sortList = new ArrayList<Map.Entry<String, Integer>>(buffCount.entrySet());
        Collections.sort(sortList, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        int max = 6;

        for(int i = 0;i<sortList.size();i++){
            Map.Entry<String,Integer> entry = sortList.get(i);
            String buff= entry.getKey();
            int count = entry.getValue();

            if(count<max&&max!=6)
                break;

            buffs.add(buff);
            max = count;
        }
        return buffs;
    }
}
