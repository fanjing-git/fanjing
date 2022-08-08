package com.yijingjj;

import java.io.*;
import java.util.*;

public class Day09 {

    public static void main(String[] args) {
        /**
         * 集合
         * 接口：Set List Map
         *List：ArrayList ， LinkedList  有序 可以出现重复的元素
         * Map：HashMap TreeMap 无序    key 唯一的，不能重复
         * Set: HashSet TreeSet 无序    不能有重复的元素
         * */
//        Collection collection = new Collection()
        int[] nums = {12, 23, 45, 36, 47, 555};
        Arrays.toString(nums);
        List list = new LinkedList();
//        List list2 = new ArrayList();
        // 填充数据到集合
        for (int i = 0; i < 100; i += 2) {
            list.add(i);
        }

        // 展示数据
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        // key value  key 不能重复 重复会覆盖之前的数据
        Map map = new HashMap();
        map.put("name", "张三");
        map.put("age", 12);
        map.put("sex", "男");
//        System.out.println(map.get("name"));
//        System.out.println(map.get("age"));
//        System.out.println(map.get("sex"));
        Set _set = map.keySet();
        Object[] _obj = _set.toArray();
        for (int i = 0; i < map.size(); i++) {
            System.out.print(_obj[i] + "  ");
            System.out.println(map.get(_obj[i]));
        }

        Map map2 = new TreeMap();
        map2.put("name", "李四");
        map2.put("age", 18);
        map2.put("sex", "男");
        Set set = map2.keySet();
//        for (int i = 0; i < set.size(); i++) {
//            System.out.println(set.);
//        }
        Set set2 = map2.keySet();
        Object[] key2 = set2.toArray();
        Object[] keys = set.toArray(); // 获取到所有的key

        System.out.println(Arrays.toString(keys));
        for (int i = 0; i < map2.size(); i++) {
            System.out.print(key2[i] + "  ");
            System.out.println(map2.get(key2[i]));
        }
        System.out.println("===============================================");
//        Set set3 = new HashSet();
        Set set3 = new TreeSet();  // 填充同一种数据类型
        set3.add("王麻子");
        set3.add("hello");
        set3.add("555");
        System.out.println(Arrays.toString(set3.toArray()));
    }
}

class Day09_1 {
    public static void main(String[] args) throws IOException {
        File file01 = new File("E:\\File");
        File file = new File("E:\\");
        System.out.println(file.exists());
        if (!file01.exists()) {
            file01.mkdir();
        }
//        file.createNewFile();
//        file01.delete();
        System.out.println("目录" + file01.isDirectory());
        System.out.println("文件" + file01.isFile());
        String[] files = file.list();
        System.out.println(Arrays.toString(files));
        System.out.println(file.exists());

        System.out.println("===============================================");
        File file02 = new File("E:\\File//1.txt");
        file02.createNewFile();

        // 输出流
        OutputStream outputStream = new FileOutputStream(file02);
        byte[] _bytes = "aaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbbbbbccccccccccccccccccc".getBytes();
        outputStream.write(_bytes);

        // 关闭流
        outputStream.close();

        // 输入流
        InputStream inputStream = new FileInputStream(file02);
        // 演示的读取一个字节数据
//        int num = inputStream.read();
//        System.out.println((char) num);

        byte[] bytes = new byte[200];
//        inputStream.skip(10);
        int num2 = inputStream.read(bytes);
        System.out.println(num2);
        System.out.println(new String(bytes));
        // 关闭
        inputStream.close();
    }
}
