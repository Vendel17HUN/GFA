package com.company;

public class FoxTailPine extends Tree {

    public FoxTailPine() {
        super();
    }

    public FoxTailPine(int height) {

        super(height);
    }

    @Override
    public void irrigate() {
        this.height += 1;
    }

}
