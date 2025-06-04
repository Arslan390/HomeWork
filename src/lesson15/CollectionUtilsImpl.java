package lesson15;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }

        Collection<Integer> result = new ArrayList<>();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }

        Collection<Integer> result = new ArrayList<>();
        for (Integer element : a) {
            if (b.contains(element)) {
                result.add(element);
            }
        }

        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }

        Set<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }

        Set<Integer> result = new HashSet<>();
        for (Integer element : a) {
            if (b.contains(element)) {
                result.add(element);
            }
        }
        
        return result;
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        if (a == null || b == null) {
            throw new NullPointerException();
        }

        Collection<Integer> timeArrayA = new ArrayList<>(a);
        Collection<Integer> timeArrayB = new ArrayList<>(b);

        timeArrayA.removeAll(timeArrayB);  // Элеметы которые есть в массиве А, но нет в массиве В.
        timeArrayB.removeAll(new ArrayList<>(a)); // Элементы которые есть в В, но нету в А.

        timeArrayA.addAll(timeArrayB); // Обединение разности.

        return new ArrayList<>(timeArrayA);
    }

}