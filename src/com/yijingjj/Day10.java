package com.yijingjj;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

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
        day10_1.setName("Day10_1");
//        day10_1.setPriority(Day10_1.MAX_PRIORITY);
        day10_1.start();  // 创建一个线程
        System.out.println(day10_1.getId());
        System.out.println(day10_1.getName());
        System.out.println(day10_1.getPriority());
        System.out.println(day10_1.getState());
        System.out.println(day10_1.toString());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = 0; i < 50; i++) {
            System.out.println("main: " + i);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Day10_2 day10_2 = new Day10_2();
//        day10_2.run(); 错误写法
        Thread thread = new Thread(day10_2);
        thread.setName("Day10_2");
        thread.setPriority(8);
        thread.start();
        System.out.println(thread.getId());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());


        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        // 计时器
        Timer timer = new Timer();
        // 日期
        Date data = new Date();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println(new Date());
            }
        }, 15*1000, 1000);

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
            if (num > 20) {
                yield();
                break;

            }
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            text();
        }
    }
}

/**
 * 接口
 * Runnable
 */
class Day10_2 implements Runnable {
    public int num;

    public void text() {
        System.out.println("Day10_2: " + num++);
    }

    @Override
    public void run() {
        while (true) {
            if (num > 50) break;
            text();
        }

    }
}