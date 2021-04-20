package com.gfa.exam.zoo;

public class Lion extends Animal {
    public Lion(String name, int age, String gender, int fedTimes) {
        super(name, age, gender, fedTimes);
    }

    @Override
    public boolean isHungry() {
        return true;
    }
}

