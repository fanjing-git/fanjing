package com.yijingjj;

import java.util.Scanner;

public class Day06 {
    /**
     * final
     * 用final 修饰变量。是不可变的，所以用final时，必须进行初始化
     * 静态变量。实例变量 局部变量
     * 用final修饰的方法，不能被子类重写、
     * fina修饰的类，不能被其他类继承
     */

    public final static byte age = 9;
    public final static float num = 3.14f;
    public static String Tag;

    public static void main(String[] args) {
        final int num1 = 12;
        System.out.println(num1);
        System.out.println(Tag);
    }
}

/**
 * 抽象类、接口
 * 使用abstract关键字修饰的类。称为抽象类
 * 使用abstract关键字修饰的方法。称之为抽象方法
 * 抽象类里面可以没有抽象方法，但是类里面有抽象方法。该类必须定义为抽象类
 * 抽象类不能用final进行进行修饰，同理。抽象方法也不能用final修饰
 * 静态关键字 static 也不能用来修饰抽象类，同理也可以得出。抽象方法也不能 static 修饰
 * 动物类
 */
abstract class Animals {
    private String name; // 动物名称 类别
    // 有花括号表示方法实现
    // 抽象方法没有花括号

    public abstract void text();

    public abstract void text(String name);
}

/**
 * 定义接口关键字 interface
 * 接口里面只能定义抽象方法。不能有具体实现，也就是不能有花括号
 * 接口里面可以定义变量，必须进行初始化，但是不能用private修饰。默认是public final static
 * 接口里面默认声明的变量，方法，都是public
 * 接口实现时不能使用继承关键字 extends,只能使用 implements关键字进行实现
 * 实现接口类所有方法，
 * 定义类实现接口里面的方法。如果定义类的没有被abstract关键词修饰，则实现接口里面的所有方法
 * 反之，如果定义类的被abstract关键字修饰。则只需要实现你想实现的接口方法就可以了
 * 接口里面可以定义静态方法。但是必须要实现。要有花括号
 * 接口不能使用final、static进行修饰
 * 接口里面定义的抽象方法不能使用 final 、static进行修饰
 */

interface _Animals {
    String _class = "_Animals ";

    void text();

    void text(String name);

    static void text(int age) {

    }
}

/**
 * 如果子类继承的父类是抽象类，需要实现抽象类里面的方法，否则子类需要定义为抽象类
 * 狗
 */
abstract class Dog extends Animals {

    @Override
    public void text() {

    }
}

/**
 * 猫
 */
class Cat implements _Animals {

    @Override
    public void text() {

    }

    @Override
    public void text(String name) {

    }
}
