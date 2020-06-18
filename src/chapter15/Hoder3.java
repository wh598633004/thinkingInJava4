package chapter15;

public class Hoder3<T> {
    private T a;
    public Hoder3(T a) {
        this.a = a;
    }
    public void set(T a) {
        this.a =a;
    }

    public T get() {
        return a;
    }

    public static void main(String[] args) {
        Hoder3<Automobile> h3 = new Hoder3<>(new Automobile());
        Automobile a = h3.get();
    }
}
