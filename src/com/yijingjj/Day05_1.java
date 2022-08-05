package com.yijingjj;

public class Day05_1 {
    // 静态语句
    // 执行时间早于main方法
    // 在一个类里面，静态语句的执行时机是最早的
    //静态语句一般用来加载，初始化一些资源
    static {
        System.out.println("hello");
    }
    public static void main(String[] args) {
        // 测试代码运行
        //测试父类
        Day1 day1 = new Day1("老虎");
        System.out.println(day1.name);
        day1.text();
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        // 测试子类
        Day2 day2 = new Day2();
        System.out.println(day2.name);
        day2.text();
    }
}

/**
 * 定义一个类，描述动物名类
 * *
 */
class Day1 {
    String name;

    public Day1() {

    }

    public Day1(String name) {
        this.name = name;
    }

    public void text() {
        System.out.println("吃东西");
    }
}

/**
 * 定义一个类，该类描述陆地老虎
 */
class Day2 extends Day1 {
    String age;

    public Day2() {
        super("老虎");
    }

    public Day2(String age) {
        super("老虎");
    }

    @Override
    public void text() {
        super.text();
        System.out.println("吃肉");
    }
}
