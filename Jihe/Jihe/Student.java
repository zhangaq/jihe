package Jihe;

public class Student {
    private String name;
    private int age;
    private String xueLi;

    public Student() {
    }

    public Student(String name, int age, String xueLi) {
        this.name = name;
        this.age = age;
        this.xueLi = xueLi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getXueLi() {
        return xueLi;
    }

    public void setXueLi(String xueLi) {
        this.xueLi = xueLi;
    }

    @Override
    public String toString(){
        return  name + age + xueLi ;
    }
}
