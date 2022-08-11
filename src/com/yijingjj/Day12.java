package com.yijingjj;

public class Day12 extends Day12_1 {
    public static void main(String[] args) {
/**
 * 注解类似于标签
 * @Override 表示改方法是重写父类的方法
 * */
    }

    @Override
    public void text() {
        super.text();
    }
}

class Day12_1 {
    public void text(){
        System.out.println("day12_1");
    }
}
