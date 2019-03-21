package Jihe;

public class Teacher {
    //成员变量
    private String name;
    private String subject;
    //无参构造
    public Teacher() {
    }
    //全参构造
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
    //成员方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
