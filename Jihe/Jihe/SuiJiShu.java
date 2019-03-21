package Jihe;

import java.util.ArrayList;
import java.util.Random;

public class SuiJiShu {
    public static void main(String[] args) {
        //创建一个集合对象
        ArrayList<Integer> list = new ArrayList<>();
        //创建随机数对象
        Random r = new Random();
        //循环十次,保存10个随机数.
        for (int i = 0; i < 10; i++) {
            //创建随机数
            int suiJi = r.nextInt(900) + 100;
            list.add(suiJi);
        }
        System.out.println(list);
        //遍历数组
        for (int i = 0; i < list.size(); i++) {
            //获取集合的元素
            Integer su = list.get(i);
            //判断
            if (su % 3 == 0) {
                //删除元素
                list.remove(i);
                i--;
            }
        }
        //打印输出结果
        System.out.println(list);

    }

}
