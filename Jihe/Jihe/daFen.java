package Jihe;

import java.util.ArrayList;
import java.util.Random;

public class daFen {
    public static void main(String[] args) {
		//gaidong
        //创建集合对象
        ArrayList<Integer> list = new ArrayList<>();
        //创建随机数对象
        Random r = new Random();
        //遍历。获取十次分数
        for (int i = 0; i < 10; i++) {
            //创建随机数
            int fen = r.nextInt(11);
            //将随机数存入集合
            list.add(fen);
        }
        //打印是个随机数集合
        System.out.println("yi" + list);
        //定义集合中的最小值
        int min = list.get(0);
        //定义集合中的最大值
        int max = list.get(0);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //找出最小值
            if (min >= list.get(i)) {
                min = list.get(i);
            } else if (max <= list.get(i)) {  //找出最大值
                max = list.get(i);
            }
        }
        //打印最大值最小值
        System.out.println(min);
        System.out.println(max);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //遍历集合，如果集合中出现等于最小值的数就删除它并结束循环遍历
            if (min == list.get(i)) {
                list.remove(i);
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            //遍历集合，如果集合中出现等于最大值的数就删除它并结束循环遍历
            if (max == list.get(i)) {
                list.remove(i);
                break;
            }
        }
        //打印去掉最大值和最小值的集合
        System.out.println(list);
        //定义总和
        double sum = 0;
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        //打印平均值
        System.out.println(sum / list.size());
    }

}