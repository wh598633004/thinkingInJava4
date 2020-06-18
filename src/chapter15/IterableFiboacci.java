package chapter15;

import java.util.Iterator;

public class IterableFiboacci extends Fibonacci implements Iterable<Integer> {
    private int n = 0;
    public IterableFiboacci(int count) {
        n = count;
    }
    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return n > 0;
            }

            @Override
            public Integer next() {
                n --;
                return IterableFiboacci.this.next();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public static void main(String[] args) {
        for(int i: new IterableFiboacci(18)) {
            System.out.println(i + " ");
        }
    }
}
