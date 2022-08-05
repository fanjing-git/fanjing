package com.yijingjj;

import java.util.Arrays;

public class Day04 {
    // 程序的入口
    public static void main(String[] args) {
        // 在调用普通方法之前，得先实列化对象
        Day04 day04 = new Day04();
        day04.text("方法重载");
        day04.text();
        day04.text(3);
        System.out.println("==========================");
        /**
         * 引用数据类型：数组 类 接口
         * 数组：一维数组  二维数组
         * Arrays 封装好了一些列的方法，可以完成对数组的各种操作
         * */


        //定义一个数组 用来存放一组同类型的数据
        // 数据类型[] 名称 数组元素初始化
        // 数组的下标是从0开始
        // length 获取数组长度
        int[] num = {1, 2, 3};
        for (int i = 0; i < num.length; i++) {
            System.out.println("数组元素:" + num[i]);
        }

        System.out.println(Arrays.toString(num));

        float[] number = {12.0f, 1.23f, 12.0001f};
        System.out.println(number);
        //Arrays.sort(number);
        //类名.方法名  静态方法调用方式
        System.out.println(Arrays.toString(number));

        System.out.println("================================================================================");
        Student[] students = new Student[6];

        // 使用关键字new 实例化对象
        Student student = new Student();   // 描述张三的相关信息
        // 拿到类后，初始化成员变量
        student.ID = "20215689001";
        student.name = "张三";
        student.age = 10;
        student.sex = '男';
        student.year = 4;
        students[0] = student;
//        System.out.println("学籍编号:" + student.ID);
//        System.out.println("姓  名:" + student.name);
//        System.out.println("年  龄:" + student.age);
//        System.out.println("性  别:" + student.sex);
//        System.out.println("年  级:" + student.year);

        // 描述李四的相关性信息
        // new Student() 调用的就是构造方法
        Student student2 = new Student();
        student2.ID = "20215689002";
        student2.name = "李四";
        student2.age = 13;
        student2.sex = '男';
        student2.year = 6;
        students[1] = student2;
//        System.out.println("学籍编号:" + student2.ID);
//        System.out.println("姓  名:" + student2.name);
//        System.out.println("年  龄:" + student2.age);
//        System.out.println("性  别:" + student2.sex);
//        System.out.println("年  级:" + student2.year);

        // 实例化有参的构造方法
        byte age = 7;
        byte year = 2;
        Student student3 = new Student("20215689003", "王麻子", age, '男', year);
        students[2] = student3;
        for (int i = 0; i < 3; i++) {
            System.out.println("学籍编号:" + students[i].ID);
            System.out.println("姓  名:" + students[i].name);
            System.out.println("年  龄:" + students[i].age);
            System.out.println("性  别:" + students[i].sex);
            System.out.println("年  级:" + students[i].year);
        }

    }

    /**
     * 方法重载与方法的返回值没有什么关系。只与参数有关 参数个数、参数类型、参数顺序
     * 在一个类里面，方法名相同，参数不一样，就可以构成方法重载
     */
    public void text() {
        System.out.println();

    }

    public void text(String str) {
        System.out.println(str);

    }

    public void text(int num) {
        System.out.println(num);
    }

}
