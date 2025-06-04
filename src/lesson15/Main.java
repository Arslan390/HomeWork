package lesson15;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        CollectionUtilsImpl collectionUtils = new CollectionUtilsImpl();
        Collection<Integer> a = new ArrayList<>();
        a.add(5);
        a.add(1);
        a.add(5);
        a.add(4);

        Collection<Integer> b = new ArrayList<>();
        b.add(8);
        b.add(7);
        b.add(5);
        b.add(1);

        System.out.println(collectionUtils.difference(a,b));
    }
}
