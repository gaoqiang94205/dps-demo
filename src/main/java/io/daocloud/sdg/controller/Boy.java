package io.daocloud.sdg.controller;

/**
 * @Author: gaoqiang
 * @Date: 2020/3/18 11:09 下午
 */
public class Boy {
    private String name;
    private int age;

    public Boy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
