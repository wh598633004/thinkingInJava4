package chapter15;
class Amphibian {}
class Vehicle {}
public class TupleTest {
    static TwoTuple<String,Integer> f() {
        return new TwoTuple<>("hi", 22);
    }

    static ThreeTuple<Amphibian, String, Integer> g() {
        return new ThreeTuple<>(new Amphibian(),"hi", 22);
    }

    static FourTuple<Vehicle,Amphibian,String,Integer> h() {
        return new FourTuple<>(new Vehicle(),new Amphibian(), "hi", 22);
    }

    static FiveTuple<Vehicle,Amphibian,String,Integer,Double> k() {
        return new FiveTuple<>(new Vehicle(),new Amphibian(),"hi", 22, 11.1);
    }

    public static void main(String[] args) {
        TwoTuple<String,Integer> ttsi = f();
        System.out.println(ttsi);
        //ttsi.first = "there";
        System.out.println(g());
        System.out.println(h());
        System.out.println(k());
    }
}
