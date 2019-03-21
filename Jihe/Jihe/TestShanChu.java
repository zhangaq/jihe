package Jihe;

import java.util.ArrayList;

public class TestShanChu {
    public static void main(String[] args) {
        shanChu1();
        shanChu2();

    }

    public static void shanChu1() {
        //定义集合
        ArrayList<Integer> list = new ArrayList<>();
        //存放数据
        list.add(99);
        list.add(66);
        list.add(12);
        list.add(24);
        list.add(25);
        list.add(33);
        //循环遍历
        for (int i = 0; i < list.size(); i++) {
            //获取每一个数组
            int sum = list.get(i);
            //判断
            if (sum > 30) {
                //删除数据
                list.remove(i);
                //[注意]删除一个数据，需要索引减少1
                //每次删除一个元素，次数减少，索引要发生改变！
                i--;
            }
        }
        System.out.println(list);
    }

    public static void shanChu2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(66);
        list.add(12);
        list.add(24);
        list.add(25);
        list.add(33);
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int sum = list.get(i);
            if(sum<30){
                array.add(sum);
            }
        }
        list = array;
        System.out.println(list);

    }

}
