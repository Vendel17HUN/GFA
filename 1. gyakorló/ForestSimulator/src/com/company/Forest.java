package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Forest {
    private final List<Tree> trees;

    public Forest(List<Tree> trees) {
        Objects.requireNonNull(trees);
        this.trees = trees;
    }

    public void rain() {
        for (Tree tree : trees) {
            tree.irrigate();
        }
    }

    public void cutTree(Lumberjack lumberjack) {
        Objects.requireNonNull(lumberjack);
        List<Tree> treesToBeCut = new ArrayList<>();
        for (Tree tree : trees) {
            if (lumberjack.canCut(tree)) {
                treesToBeCut.add(tree);
            }
        }
        trees.removeAll(treesToBeCut);
    }

    public boolean isEmpty() {
        return trees.isEmpty();
    }

    public List<String> getStatus() {
        List<String> statuses = new ArrayList<>();
        if (statuses.isEmpty()) {
            statuses.add("The forest does not have trees.");
        }
        for (Tree tree : trees) {
            String status = "'There is a " + tree.getHeight() + " tall " + tree.getClass().getSimpleName() + " in the forest.'";
            statuses.add(status);
        }
        return statuses;
    }


}

