package com.gfa.exam.zoo;

public class Elephant extends Animal {
    public Elephant(String name, int age, String gender, int fedTimes) {
        super(name, age, gender, fedTimes);
    }

    @Override
    public boolean isHungry() {
        if (isHungry() == true) {
            return false;
        } else
            return true;
    }
}

