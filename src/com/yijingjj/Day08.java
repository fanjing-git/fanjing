package com.yijingjj;

public class Day08 {
    public static void main(String[] args) throws Exception{
        // java.lang.ArithmeticException  当出现异常的运算条件是，抛出异常
        // java.lang.RuntimeException  运行时异常
        // java.lang.ArrayIndexOutOfBoundsException 非法索引访问数组时抛出的异常
        // java.lang.NullPointerException  空指针异常
        //异常处理机制 捕获异常 处理异常
        //try{.....}catch(){.....}finally{......}
        // throws 抛出异常
        // 现在有这样一个需求
        // 错误、异常的代码不会终止程序运行
        try {
            text();
            // 定义一个字符串数组
            String[] strings = new String[]{"李四", "张三", "王麻子"};
            System.out.println(strings[3]);
        } catch (ArithmeticException e) {
            // 堆栈信息
            e.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();

        }

        // 必须在控制台上出现此字符串
        System.out.println("异常操作");

    }

    public static void text() throws Exception {
        int num1 = 100;
        int num2 = 0;
//        try { // 可能出现错误或者异常的代码 try 里面的代码一旦触发异常就不会往下执行，会直接跳转到catch语句
//            System.out.println("=========================");
//            float div = num1 / num2;
//            System.out.println("00000000000000000");
//            System.out.println(div);
//            System.out.println("111111111111111111");
//
//        } catch (Exception e) { // 处理异常 打印与异常有关的信息
//            System.out.println("触发异常");
//
//        } finally {// 该部分可以省略 表示try 或者catch里面的代码是否执行，最终都会经过这里
//            System.out.println("异常演示");
//        }
        System.out.println("=========================");
        float div = num1 / num2;
        System.out.println("00000000000000000");
        System.out.println(div);
        System.out.println("111111111111111111");
    }
}
