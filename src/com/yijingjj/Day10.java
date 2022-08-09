package com.yijingjj;

public class Day10 {
    public static void main(String[] args) {
        // 进程 PID  运行程序是会产生相应的进程。与之对应有唯一的PID 比如 微信 QQ 腾讯会议。EV录屏
        // 进程与进程之间是独立的
        // 比如 手机指的是Android系统的智能机  Android系统  Linux内核
        // 父进程(PPID) 子进程(PID)
        // 线程
        // 当前所在的线程是主线程

//        Day10 day10 = new Day10();
        Day10_1 day10_1 = new Day10_1();
//        day10_1.start();  // 创建一个线程

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

    }

}

/**
 * 继承
 * Thread 线程
 */
class Day10_1 extends Thread {
    public int num;

    public void text() {
        System.out.println("执行次数： " + num++);
    }

    @Override
    public void run() {
        super.run();
        while (true) {
            text();
        }
    }
}

/**
 * 接口
 * Runnable
 */
class Day10_2 implements Runnable {

    @Override
    public void run() {

    }
}