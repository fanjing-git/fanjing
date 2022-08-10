package com.yijingjj;

import java.lang.reflect.*;

public class Day11 {
    public static void main(String[] args) {
        Day11_1 day11_1 = new Day11_1();
        day11_1.name = "李四";
//        day11_1.age=12;
//        day11_1.sex = '男';
        day11_1.text(day11_1.name);
//        day11_1.text(day11_1.name ,day11_1.age);
        Day11_1 day11_2 = new Day11_1("张三");
//        Day11_1 day11_3 = new Day11_1("张三",12);
//        Day11_1 day11_4 = new Day11_1("张三",23 ,'男');

        /**
         * 反射常用方法
         * cast forName newInstance
         * getConstructor(返回指定的构造方法) getDeclaredClasses(返回所有公开的构造方法)
         * getField(返回指定公开的字段),getFields(返回指定公开的所有字段)
         * getMethod(返回指定公开方法),getMethods（返回指定公开的所有方法）
         * getDeclaredConstructor(返回指定的构造方法) , getDeclaredConstructors（返回所有的构造方法）
         * getDeclaredField(返回指定的字段) , getDeclaredFields(返回所有字段)
         * getDeclaredMethod(返回指定的方法), getDeclaredMethods(返回所有的方法)
         * */
        Class<?> clszz;
        try {
            clszz = Class.forName("com.yijingjj.Day11_1");
            Object obj = clszz.newInstance();
            // 反射获取字段的值
            Field field_age = clszz.getDeclaredField("age");
            // 如果是私有的。设置为可见
            field_age.setAccessible(true);
            field_age.setInt(obj, 30);
            System.out.println(field_age.getInt(obj));

            // 反射调用方法
            Method method = clszz.getDeclaredMethod("text", String.class, int.class);
            // 如果方法是私有的，需要设置为可见
            method.setAccessible(true);
            method.invoke(obj, "王麻子", 45);
        } catch (ClassNotFoundException | NoSuchFieldException | IllegalAccessException | InstantiationException |
                 NoSuchMethodException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
        try {
            Constructor _method = clszz.getDeclaredConstructor(String.class, int.class);
            _method.setAccessible(true);
//            _method.newInstance(new Object[]{"张三", 25});
            Object _day11_1 = _method.newInstance("张三", 25);
            // 获取公开的字段
            // java.lang.IllegalArgumentException 参数异常
            Field field = clszz.getField("name");
            System.out.println(field.get(_day11_1));

            // 获取公开的方法
            // clszz.getMethod("text", new Class[]{String.class});
            Method method = clszz.getMethod("text", String.class);
            method.invoke(day11_1, new Object[]{field.get(_day11_1)});
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("==============================================================");

        Field[] fields = clszz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println("==============================================================");

        Constructor[] constructors = clszz.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName());
            System.out.println(constructor.toString());
            Type[] types = constructor.getGenericParameterTypes();
            for (Type type : types) {
                System.out.println(type.getTypeName());
            }
            System.out.println(constructor.getParameterCount());
            Class<?>[] classes = constructor.getParameterTypes();
            for (Class<?> _class : classes) {
                System.out.println(_class.getName());
            }
        }

        System.out.println("==============================================================");

        Method[] methods = clszz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
            System.out.println(method.toString());
            // 获取方法返回值类型
            System.out.println(method.getReturnType());
            // 获取方法参数列表
            Class<?>[] classes = method.getParameterTypes();
            for (Class<?> _class : classes) {
                System.out.println(_class.getName());
            }
        }
    }
}

class Day11_1 {
    public String name;
    private int age;
    private char sex;


    // 无参构造方法
    public Day11_1() {

    }

    Day11_1(String name) {
        this.name = name;
    }

    private Day11_1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private Day11_1(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void text(String name) {
        System.out.println("我的名字是" + name);
    }

    private void text(String name, int age) {
        System.out.println("我的名字是" + name + "今年" + age + "岁了！");

    }
}
