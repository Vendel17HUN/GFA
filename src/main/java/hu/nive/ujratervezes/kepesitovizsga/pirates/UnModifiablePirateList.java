package hu.nive.ujratervezes.kepesitovizsga.pirates;

import com.sun.javafx.UnmodifiableArrayList;

import java.util.List;

public class UnModifiablePirateList<T> extends UnmodifiableArrayList<T> {

    public UnModifiablePirateList(T[] elements, int size) {
        super(elements, size);
    }

    public UnModifiablePirateList(List<T> list) {
        super((T[]) list.toArray(), list.size());
    }

    @Override
    public boolean add(T t) {
        boolean add;
        try {
            add = super.add(t);
        } catch (UnsupportedOperationException e) {
            throw new IllegalArgumentException();
        }
        return add;
    }
}
