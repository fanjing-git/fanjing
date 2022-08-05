package com.yijingjj;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class Day07 {
    /**
     * private 私有的
     * 被private关键字修饰的方法，变量。只能在本类中使用
     * public 公开的，不受任何限制
     * 被public关键字修饰的方法。变量可以在任一类里面进行访问
     * <p>
     * protected 受保护的
     * 被protected关键字修饰的方法、变量，可以在同一包下，不同的类中进行访问，
     * 如果是不同包下有继承关系，也能进行访问
     * <p>
     * 默认的修饰符可以在同一包下，不同的类下进行相互访问
     * <p>
     * 修饰类 访问权限修饰符 public 默认的
     * 静态内部类和实例内部类 就和方法、变量一样。可以使用上面的四种修饰符进行修饰
     * 局部内部类只能使用默认修饰符，匿名内部类：如果是在类里面就没有限制。在方法中就有限制
     * 在方法里面定义的内部类只有默认修饰符
     */
    public String name; // 公开的
    protected int age;  // 受保护的
    private int num1;  // 私有的
    int num2;          // 默认的

    public static void main(String[] args) {

//        // 在当前类是可以访问的
//        Day07 day07 = new Day07();
//        day07.name = "访问权限修饰符";
//        day07.age = 13;
//        day07.num1 = 100;
//        day07.num2 = 101;


        /**
         * String
         * StringBuffer
         * StringBuilder
         * Date
         * Random
         * Number
         * Math
         * */
//        String[] name = new String[]{"李四", "王麻子", "张三"};
        String str1 = "ke.yijincc.com";
//        System.out.println(str1.length() - 1);
//        char ch1 = str1.charAt(12);
//        char ch = str1.charAt(str1.length() - 1);
//        System.out.println(ch1);
//        System.out.println(ch);
//        byte[] bytes = str1.getBytes();
//        Arrays.toString(bytes);
//        System.out.println(Arrays.toString(bytes));
//        System.out.println(str1.endsWith(".cc"));
//        System.out.println(str1.startsWith(".yi"));
//        String[] strings = str1.split(" \\.");
//
//        for (int i = 0; i < strings.length; i++) {
//
//            System.out.println(strings[i]);
//        }
//        str1.substring(2);
//
//        System.out.println(str1.substring(2, 5));
        System.out.println(str1.toUpperCase());
        String str2 = str1.toUpperCase();
//        System.out.println(str2.toLowerCase());

        System.out.println("=========================================================================");

        // StringBuffer 字符串拼接
//        System.out.println(str1 + "====>" + str2);
        StringBuffer buffer = new StringBuffer();
        buffer.append(str1);
        buffer.append("====>");
        buffer.append(str2);
        System.out.println(buffer.toString());

        // StringBuilder 字符串拼接
        StringBuilder builder = new StringBuilder();
        builder.append(str1);
        builder.append("+++");
        builder.append(str2);
        System.out.println(builder.toString());

        // Date
        Date date = new Date();
        long num = date.getTime();
        System.out.println(num);
        System.out.println(date.toString());
        System.out.println("=========================================================================");

        //Random
        Random random = new Random();
        System.out.println(random.nextInt()); // 展示的是4字节
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());
        System.out.println(random.nextInt());

        System.out.println(random.nextLong()); // 展示的是8字节
        System.out.println(random.nextLong());
        System.out.println(random.nextLong());
        System.out.println(random.nextLong());

        byte[] bytes = new byte[100];
        random.nextBytes(bytes);
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));

        System.out.println("=========================================================================");

        // Number
        byte byte01 = 100;
        Byte _Byte = 120;
        Byte _Byte2 = byte01;
        byte byte02 = _Byte;
        System.out.println(_Byte2);
        System.out.println(byte02);

        // Math
        int num1 = -1245;
        double number1 = -12.3423;
        System.out.println(num1);
        System.out.println(number1);
        System.out.println(Math.abs(num1));
        System.out.println(Math.abs(number1));
        System.out.println(Math.max(45, 80));
        System.out.println(Math.min(21, 100));


    }
}

// 同一个包下不同类
class Day07_1 {
    //测试访问
    public void Text() {
        Day07 day07 = new Day07();
        day07.name = "Day07_1";
        day07.age = 45;
        day07.num2 = 101;

    }
}

