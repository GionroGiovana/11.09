package com.company;

public class New {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public New(String name, int age)
    { this.name = name;
        this.age = age;
        System.out.println(("Создан человек " + name));


    }

}
