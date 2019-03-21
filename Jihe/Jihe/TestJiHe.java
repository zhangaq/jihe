package Jihe;

import java.util.ArrayList;

public class TestJiHe {
    public static void main(String[] args) {
        //新建一个集合对象
        ArrayList<String> list = new ArrayList<>();
        //存入数据到集合中
        list.add("古力娜扎");
        list.add("迪丽热巴");
        list.add("撒有拉拉");
        list.add("萨瓦迪卡");
        //循环遍历集合 快捷键 集合名称.fori
        for (int i = 0; i < list.size(); i++) {
            //获取集合当中的每一个元素，每一个元素都是String类型
            //快捷键 集合名称.get.var
            String s = list.get(i);
            //打印输出结果
            System.out.println(s);
        }
        System.out.println(list);


    }
}
