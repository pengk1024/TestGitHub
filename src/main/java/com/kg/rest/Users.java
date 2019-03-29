package com.kg.rest;

import java.io.Serializable;

/**
 * @author long chen
 * @date 2019/3/29
 * @description
 */
public class Users implements Serializable {

    private int id;

    private String name;

    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Users{id=" + id + ", name='" + name + '\'' + ", age=" + age + '}';
    }
}
