package io.daocloud.sdg.wrapper;

import org.springframework.beans.BeanWrapperImpl;

import java.beans.PropertyDescriptor;

/**
 * @Author: gaoqiang
 * @Date: 2020/7/14 10:12 上午
 */
public class DogWrapper {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setName("huanghuang");
        dog.setAge(1);
        BeanWrapperImpl dw = new BeanWrapperImpl(dog);

        PropertyDescriptor des = dw.getPropertyDescriptor("name");

        System.out.println(des);
    }
}
