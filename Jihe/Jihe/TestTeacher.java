package Jihe;

import java.util.ArrayList;

public class TestTeacher {
    public static void main(String[] args) {


        //定义一个集合对象
        ArrayList<Teacher> teachers = new ArrayList<>();
        //定义三个教师对象
        Teacher t1 = new Teacher("李红","语文");
        Teacher t2 = new Teacher("张敏","英语");
        Teacher t3 = new Teacher("李明","数学");
        //把教师对象存入集合中
        teachers.add(t1);
        teachers.add(t2);
        teachers.add(t3);
        //遍历集合
        for (int i = 0; i < teachers.size(); i++) {
            //条件判断
            if(teachers.get(i).getName().equals("李明")||teachers.get(i).getName().equals("李红")){
                //修改集合中的值
                teachers.get(i).setSubject("物理");
            }
            //打印输出
            System.out.println("姓名:"+teachers.get(i).getName()+"-"+"学科:"+teachers.get(i).getSubject());
  /*          if(teachers.get(i).getName()=="李明"||teachers.get(i).getName()=="李红"){
                  teachers.get(i).setSubject("物理");
            }
  */
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("dskj");
        list.add("sdfs");
        list.add("234");
        System.out.println(list);
        System.out.println(teachers);
    }
}
