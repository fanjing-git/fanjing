package com.yijingjj;

import java.util.Scanner;

public class Day02 {
    public static void main(String[] args) {
        /**
         * 条件语句
         *  if(){}
         * 	if()else{}
         * 	if(){}else if()else if{}
         * 	if (){}else if()else{}
         * **/
//        double num1 = 90.66;
//        double num2 = 100.002;
//        double sum = 0;
//        boolean rel9 = false;

        /**
         * 循环语句
         * while 先判断后执行
         * do....while 先执行一次在进行判断
         * **/
        // while (true) {
//            // 使用该类获取控制台输入的数据
//            Scanner scanner = new Scanner(System.in);
//            String text = scanner.nextLine();
//            System.out.println(text);
//            switch (text) {
//                case "+":
//                    sum = num1 + num2;
//                    break; //执行跳出switch结构
//                case "-":
//                    sum = num1 - num2;
//                    break;
//                case "*":
//                    sum = num1 * num2;
//                    break;
//                case "/":
//                    sum = num1 / num2;
//                    break;
//                case "NO":
//                    rel9 = true;
//                default:
//                    System.out.println("输入不合法!");
//            }
//            if (sum != 0)
//                System.out.println(num1 + "" + text + "" + num2 + "=" + sum);

//        int num = 10;
//        do {
//            // num++;先进行运算，在进行自增1
//            // ++num;先自增1，在进行运算
//            // num--; 先进行运算，在自减1
//            // --num; 先自减1 ，在进行运算
//            // num++;
//            num--;
//            // System.out.println("num1:" + (++num));
//            System.out.println("num2:" + num);
//            System.out.println("测试do....while");
//        } while (num >= 2);
//        // 循环打印输出1-100的数据。要求初始值为0
//        int num3 = 0;
//        do {
//            // ++num3;
//            // num3++;
//            System.out.println(++num3);
//        } while (num3 < 100);
        // 编写程序，输出100的阶乘，如：1*2*3*....*100
//        long sum = 1;
//        do {
//            ++num3;
//            sum *= num3;
//            System.out.println("num3:" + num3 + " ");
//            System.out.println("阶乘sum" + sum);
//        } while (num3 < 100);
//
//        sum = 0;
//        for (int i = 0; i < 10; i++) {
//            sum += i;
//            System.out.println("i:" + i + "    ");
//            System.out.println("和:" + sum);
//        }

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

        // 使用while循环实现奇数的累加 1-100
        int i = 0;
        int sum = 0;
//        while (i < 100) {
//            i++;
//            if (i % 2 == 1)
//                sum += i;
//            System.out.println("i:" + i);
//        }
//        System.out.println("sum:" + sum);

        // 使用do....while循环实现偶数的累加 1-100
        i = 0;
        sum = 0;
        do {
            ++i; // 自增1
            if (i % 2 == 1) {
                continue;  // 结束当前循环
            }
            sum += i;
            System.out.println("i:" + i);
        } while (i < 100);
        System.out.println("sum:" + sum);
    }
}


// }

