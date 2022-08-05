package com.yijingjj;
/**
 * 我们创建每一个类，我们默认继承Object
 * import 导入包的关键字
 * java.lang下的类，默认自动导入
 * package 定义包名
 */
public class Day06_1 {

    public static void main(String[] args) {
        // 匿名内部类
        // 匿名内部类 即可写在方法里面，也可以写在类里面
        // 匿名内部类中的方法和变量不能使用static修饰
        // 匿名内部类中定义的成员变量。不能在外部通过对象进行访问
        _Animals _animals = new _Animals() {
            String Tag = "_animals";

            @Override
            public void text() {
                System.out.println("匿名内部类" + Tag);
            }

            @Override
            public void text(String name) {
                System.out.println("===========>" + name);

            }
        };

        _animals.text();
        _animals.text("hello");


        System.out.println("======================================================");
        // 测试实例内部类中定义的静态变量
        System.out.println(Day06_2.Tag);
        // 测试静态内部类
        Day06_3 day06_3 = new Day06_3();
        System.out.println(day06_3.name);
        System.out.println(Day06_3.Tag);
        // 对象.方法名
        day06_3.text();
        // 类名.方法名
        Day06_3.text("实例静态内部类");
        System.out.println("======================================================");

        // 测试实例内部类中定义的静态变量
        System.out.println(Day06_2.Tag);
        Day06_1 day06_1 = new Day06_1();
        day06_1.text();
    }

    Animals animals = new Animals() {
        @Override
        public void text() {

        }

        @Override
        public void text(String name) {

        }
    };

    public void text() {
        // 测试实例内部类 不能直接在静态方法中实例化对象
        Day06_2 day06_2 = new Day06_2();
        System.out.println(day06_2.Tag);
        day06_2.text();
        System.out.println("======================================================");
        /**
         * 在方法里面定义的类
         * 局部内部类，不能使用静态关键字static修饰
         * 局部内部类中声明的变量不能使用static进行修饰
         * 局部内部类中声明的方法不能使用static进行修饰
         * */
        class Day06_5 {
            String Tag = "Day06_5";

            public void text() {
                System.out.println("局部内部类");
            }

//            public  void text(String name) {
//                System.out.println("局部内部类");
//
//            }
        }
        //测试局部内部类
        Day06_5 day06_5 = new Day06_5();
        System.out.println(day06_5.Tag);
        day06_5.text();

    }

    // 在类里面定义的类
    //实例内部类，没有被静态关键字 static修饰
    // 实例内部类中的变量不能使用静态关键字static进行修饰
    // 实例内部类中的方法不能使用静态关键字static进行修饰
    class Day06_2 {

        // static + final修饰的是常量
        // 定义全局 都可以进行访问
        static final String Tag = "Day06_2";

        public void text() {
            System.out.println("实例内部类");
        }
    }


    // 静态内部类
    static class Day06_3 {
        final String name = "静态内部类";
        static final String Tag = "Day06_3";

        public final void text() {
            System.out.println("静态内部类");

        }

        public static void text(String name) {
            System.out.println("====>" + name);
        }
    }
}
