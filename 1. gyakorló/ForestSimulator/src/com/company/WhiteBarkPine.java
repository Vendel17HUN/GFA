package com.company;

public class WhiteBarkPine extends Tree {

    public WhiteBarkPine() {
        super();
    }

    public WhiteBarkPine(int height) {
        super(height);
    }

    @Override
    public void irrigate() {

        this.height += 2;
    }

}