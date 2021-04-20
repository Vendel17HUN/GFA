package com.greenfoxacademy;

public class Animal {
    String name;
    int number;

    public Animal(String name, int number){
        this.name=name;
        this.number=number;
    }

    @Override
    public String toString() {
        return "{\n"+"\""+name+"\"" +" : "+number+"\n}";
    }
}
