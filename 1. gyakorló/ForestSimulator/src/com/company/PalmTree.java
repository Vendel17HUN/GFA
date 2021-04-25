package com.company;

public class PalmTree extends Tree {

    public PalmTree() {
        super();
    }

    public PalmTree(int height) {
        super(height);
    }

    @Override
    public void irrigate() {
        this.height += 0.5;
    }

}