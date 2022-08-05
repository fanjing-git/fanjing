package com.test;

import com.yijingjj.Day06;
import com.yijingjj.Day07;

public class Test extends Day07 {
    public static void main(String[] args) {
        // 在其他类里面访问静态变量，使用类名.变量名 进行访问
        System.out.println(Day06.age);

        // 测试不同包。不同类
        Day07 day07 = new Day07();
        day07.name = "Text";
    }

    public void text() {
        super.age = 13;
    }
}
