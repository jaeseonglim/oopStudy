package step11.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

class InstrumentHashSet<E> implements Set<E> {
    private int addCount = 0;
    private Set<E> set;

    public InstrumentHashSet(final Set<E> set) {
        this.set = set;
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return set.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return set.addAll(c);
    }

    @Override
    public int size() {
        return set.size();
    }

    @Override
    public boolean isEmpty() {
        return set.isEmpty();
    }

    @Override
    public boolean contains(final Object o) {
        return set.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return set.iterator();
    }

    @Override
    public Object[] toArray() {
        return set.toArray();
    }

    @Override
    public <T> T[] toArray(final T[] a) {
        return set.toArray(a);
    }

    @Override
    public boolean remove(final Object o) {
        return false;
    }

    @Override
    public boolean containsAll(final Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(final Collection<?> c) {
        return set.retainAll(c);
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        return set.removeAll(c);
    }

    @Override
    public void clear() {

    }
}
