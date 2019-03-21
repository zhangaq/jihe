package Jihe;

import java.util.ArrayList;

public class TestStudent {
    public static void main(String[] args) {
        //创建集合对象
        ArrayList<Student> students = new ArrayList<>();
        //创建3个student对象
        Student one = new Student("小红",12,"小学");
        Student two = new Student("小米",21,"大学");
        Student three = new Student("小明",14,"初中");
        //给集合赋值
        students.add(one);
        students.add(two);
        students.add(three);
        //遍历集合
        for (int i = 0; i < students.size(); i++) {
            //找出年龄小于15的学生
            //int age = students.get(i).getAge();
            if(students.get(i).getAge()<15){
                //修改学历
                students.get(i).setXueLi("幼儿园");
            }
            //Student student = students.get(i);
            //打印输出
            System.out.println(students.get(i).getName()+"-"+ students.get(i).getAge()+"-"+ students.get(i).getXueLi());
        }

        System.out.println(students);
    }
}
