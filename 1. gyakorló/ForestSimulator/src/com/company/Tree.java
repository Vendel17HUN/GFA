package com.company;

public class Tree {
    protected int height;

    public Tree() {
        this(0);
    }

    public Tree(int height) {
        if (height < 0) {
            throw new IllegalArgumentException("Height cannot be negative.");
        }
        this.height = height;
    }

    public void irrigate() {

    }

    public int getHeight() {
        return height;
    }
}
