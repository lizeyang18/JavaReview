package com.company;

import javafx.scene.input.DataFormat;

import javax.print.DocFlavor;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
import java.util.*;

public class Main {
    /**
     * 打印对象
     *
     * @param index
     * @param obj
     */
    public static void print(int index, Object obj) {
        System.out.println(String.format("{%d},%s", index, obj.toString()));
    }

    public static void demoOperation() {
        print(1, 5 / 2);
        print(2, 5 - 2);
    }

    public static void demoControllFlow() {
        int score = 66;
        if (score > 80) {
            print(1, "A");
        } else if (score > 60) {
            print(2, "B");
        } else {
            print(3, "C");
        }

        String grade = "B";
        switch (grade) {
            case "A":
                print(4, "score>80");
                break;
            case "B":
                print(5, "(60,80)");
                break;
            default:
                print(6, "(0,60)");
        }

        String str = "hello";
        for (char c : str.toCharArray()) {
            print(9, c);
        }
    }

    public static void demoString() {
        String str = "hello nowcoder";
        print(1, str.indexOf('e'));
        print(2, str.charAt(6));
        print(3, str.codePointAt(1));
        print(4, str.compareTo("hello lieyang"));
        print(5, str.concat("lizeyang"));
        print(6, str.lastIndexOf('o'));
        print(7, str.toUpperCase());
        print(8, str.replaceAll("0|l", "a"));
        print(9, str.replaceAll("hello", "hi"));

        StringBuilder sb = new StringBuilder();
        sb.append(true);
        sb.append(1);
        print(10, sb.toString());
        print(11, "a" + "b" + String.valueOf(12));
    }

    public static void demopList() {
        List<String> strlist = new ArrayList<>();
        for (int i = 0; i < 4; ++i) {
            strlist.add(String.valueOf(i));
        }
        print(1, strlist);
        strlist.remove(0);
        print(2, strlist);
        print(3, strlist.get(1));

        Collections.sort(strlist, new Comparator<String>() {
            //reverse strlist
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        print(4, strlist);
    }

    //集合功能
    public static void demoSet() {
        Set<String> strSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            strSet.add(String.valueOf(i));
        }
        print(1, strSet);
        print(2, strSet.contains((4)));
        strSet.addAll(Arrays.asList(new String[]{"A", "B"}));
        print(3, strSet);
        print(4, strSet.size());
        print(5, strSet.isEmpty());
    }

    public static void KeyValue() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 4; i++) {
            map.put(String.valueOf(i), String.valueOf(i * i));
        }
        print(1, map);
        for (Map.Entry<String, String> entry : map.entrySet()) {
            print(2, entry.getKey() + ":" + entry.getValue());
        }
        print(3, map.keySet());
        print(4, map.values());
        print(5, map.containsKey("2"));
        map.replace("1", "A");
        print(6, map);
    }

    public static void demoException() {
        try {
            print(1, "hello");
            int a = 2;
            a = a / 0;
            String b = null;
            b.indexOf('a');
        } catch (NullPointerException npe) {
            print(2, "npe");
        } catch (Exception e) {
            print(3, "Exception");
        } finally {
            print(4, "finally块");
        }
    }

    public static void demoCommon() {
        //salt uuid
        Random random = new Random();
        random.setSeed(1);
        for (int i = 0; i < 4; ++i) {
            print(1, random.nextInt(100));
        }
        List<Integer> array = Arrays.asList(new Integer[]{1, 2, 3, 4});
        print(2, array);
        Collections.shuffle(array);
        print(3, array);

        Date date = new Date();
        print(4, date);
        print(5,date.getTime());
        DateFormat df = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        print(6,df.format(date));
        print(7,DateFormat.getDateInstance(DateFormat.FULL).format(date));

        print(8,UUID.randomUUID());
        print(9,Math.max(1,2));
        print(10,Math.ceil(2.2));  //进位
        print(11,Math.floor(2.6)); //取最低位
    }

    public static void demoClass(){
        Animal animal = new Animal("Jim",2);
        animal.say("dog");
    }

    public static void main(String[] args) {
        //System.out.print("hello lizeyang!");
        //print(1,"hello lizeyang!");
        //demoOperation();
        //demoControllFlow();
        //demoString();
        //demopList();
        //demoSet();
        //KeyValue();
        //demoException();
        //demoCommon();
        demoClass();
    }
}
