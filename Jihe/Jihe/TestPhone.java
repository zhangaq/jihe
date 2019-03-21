package Jihe;



import java.util.ArrayList;

public class TestPhone {
    public static void main(String[] args) {
        //创建一个集合对象
        ArrayList<Phone> list = new ArrayList<>();
        //创建4个手机对象
        Phone ph1 = new Phone("华为", 1200, 4);
        Phone ph2 = new Phone("苹果", 9000, 1);
        Phone ph3 = new Phone("锤子", 3000, 3);
        Phone ph4 = new Phone("小米", 1800, 2);
        //将对象存入集合中
        list.add(ph1);
        list.add(ph2);
        list.add(ph3);
        list.add(ph4);
        //遍历集合
        for (int i = 0; i < list.size(); i++) {
            //获取使用年限
            //int nianXi = list.get(i).getNianXi();
            //获取价格
            //int jiaGe = list.get(i).getJiaGe();
            //条件判断
            if (list.get(i).getNianXi() <= 2 && list.get(i).getJiaGe() < 2000) {
                Phone phone = list.get(i);
                System.out.println(phone.getPinPai() + "-" + phone.getJiaGe() + "-" + phone.getNianXi());
            }
            if(list.get(i).getJiaGe()>5000){
                list.remove(i);
            }
            Phone phone = list.get(i);
            System.out.println(phone.getPinPai()+phone.getJiaGe()+phone.getNianXi());
        }

        System.out.println(list);


    }
}
