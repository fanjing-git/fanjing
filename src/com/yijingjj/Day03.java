package com.yijingjj;

import java.util.Scanner;

/**
 * public 修饰符 公开的
 * calss  修饰符类 定义类的关键字
 * Day03 类名
 */
public class Day03 {
    /**
     * 在类里面定义的变量，分为两类
     * 普通字段 或者 实列字段 指得是没有被静态关键字修饰的字段
     * 静态字段 指得是有被static关键字修饰的字段
     * */
    // 访问权限修饰符 数据类型 字段名称 值(初始化)
    // 定义普通字段 属于对象级别
    private String name="迁羽";

    //定义静态字段 静态字段属于类级别
    private static int age =29;

    // public 修饰符 公开的，公有的
    // static 静态关键字
    // void 返回值类型 byte
    // main 方法名称
    // String[] args 参数列表
    public static void main(String[] args) {
        // 现在有这样一个需求：打印10个菱形
//        _print();
        System.out.println(age);
        // 完成1-1000以内的偶数累加操作
        // _add(1000);
        //System.out.println(_add(1000));

        // 创建对象 实例化对象
//        Scanner scanner = new Scanner(System.in);
//        int num = scanner.nextInt();
//        System.out.println(_add(num));
        /**
         * 实现简易的计算器，要求用方法封装对应的实现
         * 数据类型 int
         * */
        int num1 = 20;  //在方法内部声明的变量。称为局部变量 num1
        int num2 = 7;
        // new 创建对象
        // 想要调用类里面的普通方法。必须先实例化对象。在通过对象进行调用
        // day03就是实例化后的对象。然后通过这个day03调用add方法
        // 普通方法 对象级别的调用
        Day03 day03 = new Day03();
        int rel = day03.add(num1, num2);// 调用方法时传入参数就是实参。就是num1和num2
        System.out.println("和" + rel);
        int rel2 = day03.mul(num1, num2);
        System.out.println("乘:" + rel2);
        int rel3 = day03.div(num1, num2);
        System.out.println("除" + rel3);
        System.out.println(day03.name);
    }

    /**
     * 不适用静态关键字修饰方法
     * 访问修饰符 public  private
     * 返回值 int
     * 参数 传入两个参数 数据类型 int
     */
    public int add(int a, int b) {  // 定义方法时，制定的参数列表，称之为形参
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mul(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    public static void _print() {
        for (int i = 0; i < 8; i++) {  //控制行
            System.out.print("-");
            for (int j = 7; j > i; j--) {  //控制列
                System.out.print("-");
            }

            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i + 2; j++) {
                System.out.print("-");

            }
            for (int j = 8; j > i * 2 - 4; j--) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

    /**
     * 本方法的任务：完成偶数数字的累加
     * private 私有的，只能在本类中使用
     * return  直接结束方法的执行
     * 被 static关键字修饰的方法，称之为静态方法
     * 静态方法。类级别的调用
     */

//    private static int _add(int num) {
//        int i = 0;
//        int sum = 0;
//        do {
//            ++i; // 自增1
//            if (i % 2 == 1) {
//                continue;  // 结束当前循环
//            }
//            sum += i;
//            System.out.println("i:" + i);
//
//        } while (i < num);
//        return sum;
//    }

}
