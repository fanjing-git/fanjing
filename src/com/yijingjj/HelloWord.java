package com.yijingjj;

public class HelloWord {
    public static void main(String[] args) {
        System.out.println("欢迎同学们的到来线下实地培训课堂！！！！");
        //在方法里面声明的变量叫局部变量
        // 单行注释
        /****/
        //31928
        //void int String lang float double bool
        int num1 = 12;
        int num2 = 31928;
        int _add = num1 + num2;

        //除法：31928/2
        int num3 = 2;
        int _div = num2 / num3;
        System.out.println(_add);
        System.out.println(_div);

        //加法：31928+13
        int num4 = 13;
        int _add1 = num2 + num4;
        System.out.println(_add1);

        //减法：31928-11
        int num5 = 11;
        int _add2 = num2 - num5;
        System.out.println(_add2);

        //乘法：31928*14
        int num6 = 14;
        int _add3 = num2 * num6;
        System.out.println(_add3);
        System.out.println("==============================");
        /**
         * 逻辑运算符
         * &&  ||  ！
         * & | :操作二进制位 按位逻辑与和按位逻辑或
         * **/
        int a = 0;
        int b = 1;
        int c = 2;
        int d = 2;
        // || （或）只要其中一个条件满足，则为true
        // && （且）只要其中一个条件不满足，则为false
        // ! (非) 真就是假，假就是真
        System.out.println(!(a == b));
        System.out.println(a == b && c == d);
//        System.out.println(a==b || c==d);
        System.out.println("====================");

        /**
         * 关系运算符
         * ==  <=  >=  <  >
         * **/
        int e = 19;
        short f = 4;
//        boolean rel =false;
        System.out.println(e == f);
        System.out.println(e >= f);
        System.out.println(e <= f);
        System.out.println(e > f);
        System.out.println(e < f);
        System.out.println("========================================");

        /**
         * 三目表达式
         * 表达式1 ？表达式2 : 表达式3
         * 表达式1成立，则执行表达式2，否则走表达式3
         * **/
        int number1 = 56;
        int number2 = 70;
        System.out.println(number1 >= number2 ? number1 - number2 : number1 + number2);
        System.out.println("========================================+===============================");

        /**
         * 赋值运算符
         * = += -= *= /= %=
         * **/
        number1 += 10;  // number1 = number1+10
        number2 %= 100;//number2=number%20
        System.out.println(number1);
        System.out.println(number2);

        /**
         * 条件语句
         * if
         * **/
        String name = "qianyu";
        String pwd = "123456";
        String _name = "qianyu";

        if (name == _name && pwd == "123456") {
            System.out.println("登录成功！");
        } else {
            System.out.println("登录失败！");
        }

        if (name != _name) {
            System.out.println("提示账号不正确!");
        } else if (pwd != "123456") {
            System.out.println("提示密码不正确!");
        } else {
            System.out.println("登录成功!");
        }
    }
}

    