package Miscellaneous;

import java.util.Iterator;

public class CustomGenerics<T> implements Iterable<T> {
    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public CustomGenerics() {
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T element) {
        items[size++] = element;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new CustomGenericsIterator(this);
    }

    private class CustomGenericsIterator implements Iterator<T> {
        private CustomGenerics<T> list;
        private int idx = 0;

        public CustomGenericsIterator(CustomGenerics<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            // System.out.println("hasNext called");
            return idx < list.size;
        }

        @Override
        public T next() {
            // System.out.println("next called");
            return list.items[idx++];
        }

    }

    public static void main(String[] args) {
        CustomGenerics<Integer> c = new CustomGenerics<>();
        c.add(10);
        c.add(23);
        c.add(40);
        // System.out.println(c.get(0));

        for (int i : c) {
            System.out.println(i);
        }

        System.out.println("........................");
        Iterator<Integer> it = c.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
