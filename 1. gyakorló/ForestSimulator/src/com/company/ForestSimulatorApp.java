package com.company;

import java.util.ArrayList;
import java.util.List;

public class ForestSimulatorApp {

    public static void main(String[] args) {


        List<Tree> treesToBeAddedToForest = new ArrayList<>();
        treesToBeAddedToForest.add(new WhiteBarkPine(2));
        treesToBeAddedToForest.add(new FoxTailPine(5));
        treesToBeAddedToForest.add(new WhiteBarkPine(12));
        treesToBeAddedToForest.add(new ChristmasTree(7));
        treesToBeAddedToForest.add(new PalmTree(1));
        treesToBeAddedToForest.add(new FoxTailPine());
        treesToBeAddedToForest.add(new WhiteBarkPine(4));
        treesToBeAddedToForest.add(new FoxTailPine(9));
        treesToBeAddedToForest.add(new WhiteBarkPine(13));
        treesToBeAddedToForest.add(new ChristmasTree(8));
        treesToBeAddedToForest.add(new PalmTree(2));
        Forest forest = new Forest(treesToBeAddedToForest);
        System.out.println();

        printStringListWithNewLine(forest.getStatus());
        System.out.println();

        forest.rain();
        System.out.println("It's raining...");
        printStringListWithNewLine(forest.getStatus());
        System.out.println();

        Lumberjack lumberjack = new Lumberjack();
        System.out.println("Cutting trees...");
        forest.cutTree(lumberjack);
        printStringListWithNewLine(forest.getStatus());
        System.out.println();

        System.out.println("Heavy rain...");
        for (int i = 0; i < 10; i++) {
            forest.rain();
        }
        printStringListWithNewLine(forest.getStatus());
        System.out.println();

        System.out.println("Cutting trees...");
        forest.cutTree(lumberjack);
        printStringListWithNewLine(forest.getStatus());

    }

    public static void printStringListWithNewLine(List<String> stringList) {
        for (String str : stringList) {
            System.out.println(str);
        }
    }
}