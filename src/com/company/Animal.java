package com.company;

/**
 * Created by lizeyang on 2019/4/15.
 */
public class Animal implements Talking{
    private String name;
    private int age;

    Animal(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void say(String name) {
        System.out.println("This is a "+name);
    }
}
