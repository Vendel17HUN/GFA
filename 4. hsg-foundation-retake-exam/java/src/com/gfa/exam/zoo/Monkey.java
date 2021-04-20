package com.gfa.exam.zoo;

import java.util.Random;

public class Monkey extends Animal {
    public Monkey(String name, int age, String gender, int fedTimes) {
        super(name, age, gender, fedTimes);
    }

    @Override
    public boolean isHungry() {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(100);
        if (rand_int1 < 50) {
            return true;
        } else {
            return false;
        }
    }
}
