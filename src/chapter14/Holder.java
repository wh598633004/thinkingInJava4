package chapter14;

public class Holder<T> {
    private T value;
    public Holder() {}
    public Holder(T val) {
        value = val;
    }
    public void set(T val) {
        value = val;
    }
    public T get() {
        return value;
    }
    public boolean equals(Object obj) {
        return value.equals(obj);
    }

    public static void main(String[] args) {
        Holder<Apple> Apple = new Holder<>(new Apple());
        Apple d = Apple.get();
        Apple.set(d);
        Holder<? extends Fruit> fruit = Apple;
        Fruit p = fruit.get();
        d = (chapter14.Apple) fruit.get();
        try{
            Orange  c= (Orange) fruit.get();
        } catch (Exception e) {
//            fruit.set(new Apple());
            System.out.println(fruit.equals(d));
        }
    }

}
