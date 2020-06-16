package chapter14;

abstract class GenericWidthCreate<T> {
    final T element;
    GenericWidthCreate() {
        this.element = create();
    }
    abstract T create();
}
class X {}
class Creator extends GenericWidthCreate<X> {

    @Override
    X create() {
        return new X();
    }
    void f() {
        System.out.println(element.getClass().getSimpleName());
    }
}
public class CreateGeneric {
    public static void main(String[] args) {
        Creator c = new Creator();
        c.f();
    }
}
