package com.yijingjj;

public class Day05 {
    public static void main(String[] args) {
        // 使用new关键字实例化对象，对里面的成员属性，成员变量进行初始化
        People people = new People("522130202106531247", "张三", 19, '男');
        System.out.println(people.getId_card());
        System.out.println(people.getName());
        System.out.println(people.getAge());
        System.out.println(people.getSex());
        System.out.println("========================================================================");

        _People _people = new _People(180, 140, "中国");
        System.out.println(_people.getId_card());
        System.out.println(_people.getName());
        System.out.println(_people.getAge());
        System.out.println(_people.getSex());
        System.out.println(_people.getHeight());
        System.out.println(_people.getWeight());
        System.out.println(_people.getState());
        _people.text();


        // Day05 day05 = new Day05();
        //  day05.text();
        // Day05_1 day05_1 = new Day05_1();
        // Day05_2 day05_2 = new Day05_2(); 错误的写法
    }

    /**
     * 在类里面定义的类叫内部类
     * 没有被静态关键字 static 修饰的类。无法在静态方法里面使用
     */
    static class Day05_1 {

    }

    public void text() {
        Day05_2 day05_2 = new Day05_2();
    }

    class Day05_2 {
    }
}

// 封装的概念：
// 属性私有化  成员变量使用private关键字进行修饰
// 提供相应的get set等方法，方法对应的成员变量
class People {
    // 身份证
    // 姓名
    // 性别
    // 年龄
    // 身高
    // 体重
    // 肤色
    private String id_card;
    private String name;
    private int age;
    private char sex;

    public People() {

    }

    public People(String id_card, String name, int age, char sex) {
        this.id_card = id_card;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setId_card(String id_card) {
        this.id_card = id_card;
    }

    public String getId_card() {
        return this.id_card;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return this.sex;
    }

    public void text() {
        System.out.println("我是父类的方法");
    }
}

/**
 * People 父类 基类
 * _People 子类
 * 继承的关键字 extends
 * super 指向父类的引用
 * this 指向当前类的应用
 */
class _People extends People {
    private int height;  // 身高
    private int weight;  // 体重
    private String state; // 国家

    // 无参的构造方法
    public _People() {
        super(); // 调用父类的无参构造方法
    }

    // 有参的构造方法
    public _People(int height, int weight, String state) {
        super("522130202106536666", "李四", 29, '男'); // 调用父类有参构造方法，进行初始化
        this.height = height;
        this.weight = weight;
        this.state = state;

    }

    public void setHeight(int height) {

        this.height = height;
    }

    public int getHeight() {

        return this.height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }


    /**
     * 要想实现方法重写，类与类之间存在继承
     * 子类可以重写父类的方法  进行功能上的扩展
     * 重写父类方法需要保证访问修饰符 返回值 方法名 参数列表一致
     * final 被final修饰的 不可变
     */
    @Override
    public void text() {
        super.text();
        System.out.println("重写了父类方法");
    }
}