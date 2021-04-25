package com.company;

public class ChristmasTree extends Tree {

    public ChristmasTree() {
        super();
    }

    public ChristmasTree(int height) {
        super(height);
    }

    @Override
    public void irrigate() {
        this.height += 3;
    }

}
