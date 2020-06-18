package chapter15;

public class ThreeTuple<A,B,C> extends TwoTuple<A,B> {
    public final C thrid;
    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        this.thrid = c;
    }

    public String toString() {
        return "(" + first + "," + second + "," + thrid +")";
    }
}
