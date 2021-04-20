package com.gfa.exam.zoo;

public abstract class Animal {
    protected String name;
    protected int age = 0;
    protected String gender = "ismeretlen";
    protected int fedTimes;

    public Animal(String name, int age, String gender, int fedTimes) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.fedTimes = fedTimes;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setFedTimes(int fedTimes) {
        this.fedTimes = fedTimes;
    }

    public int getFedTimes() {
        return fedTimes;
    }

    public int eat(int fedTimes) {
        return getFedTimes() + 1;
    }

    public abstract boolean isHungry();

    @Override
    public String toString() {
        return name + " " + age + " éves " + gender + " állat és megetették " + fedTimes + " alkalommal";
    }
}

