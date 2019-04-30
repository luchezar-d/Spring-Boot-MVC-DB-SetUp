package com.SpringBoot.Spring.MVC.entities;

public class Dog implements Animal {

    private String name;

    public Dog() {}

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
