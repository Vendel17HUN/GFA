package com.gfa.exam.zoo;

import java.util.ArrayList;
import java.util.List;

public class Worker {
    private List<Animal> animalsToLookAfter = new ArrayList<>();
    protected String name;


    public Worker(String name) {
        this.name = name;
    }

    public void doDailyRoutine() {
        List<String> doDailyRoutine = new ArrayList<>();
        for (Animal animals : animalsToLookAfter) {
            if (doDailyRoutine.contains(animalsToLookAfter)) {
                doDailyRoutine.add(animals.name);
            }
        }
    }

}
