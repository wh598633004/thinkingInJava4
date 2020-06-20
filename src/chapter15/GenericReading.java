package chapter15;

import java.util.Arrays;
import java.util.List;

public class GenericReading {
    static <T> T readExat(List<T> list) {
        return list.get(0);
    }
    static List<Apple> apples = Arrays.asList(new Apple());
    static List<Fruit> fruit = Arrays.asList(new Fruit());
    static void f1() {
        Apple a = readExat(apples);
        Fruit f = readExat(fruit);
        f= readExat(apples);
    }
    static class Reader<T> {
        T readExat(List<T> list) {
            return list.get(0);
        }
    }
    static void f2() {
        Reader<Fruit> fruitReader = new Reader<>();
        Fruit f= fruitReader.readExat(fruit);
//        Fruit a = fruitReader.readExat(apples);
    }
}
