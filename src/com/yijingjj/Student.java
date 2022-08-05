package com.yijingjj;

public class Student {
    //描述小学（1-6）学生  属性 成员变量 实例变量 普通变量
    // 学籍编号 名字 年龄 性别 年级 班级 未成年  模板
    // 具体描述一个学生  对象 是真实存在的
    // 张三
    // 20215689001
    // 10
    // 男
    // 三年级
    // 三班

    String ID;     // 学籍编号是唯一的
    String name;   // 名字
    byte age;      // 年龄
    char sex;      // 性别
    byte year;     // 年级

    //构造方法 构造器

    /**
     * 新建每一个类都会为我们提供一个默认的无参构造方法
     * 但是，一旦我们自己定义了有参构造方法之后，系统就不会给我们提供无参的构造方法
     * 构造方法的方法名和类名一致
     * 构造方法无返回值
     */
    // 定义无参的构造方法
    public Student() {

    }
    public Student(String ID){
        this.ID=ID;
    }

    public Student(String ID , String name){
        this.ID=ID;
        this.name=name;
    }

    // 定义一个有参的构造方法
    /**
     * this 指向当前类对象 用来访问当前类的成员变量和成员方法  指的是没有被static修饰的变量和方法
     * 被static修饰的变量和方法不能通过this进行访问
     * */
    public Student(String ID, String name, byte age, char sex, byte year) {
        this.ID=ID;
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.year=year;
    }
}
