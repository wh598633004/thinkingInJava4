package chapter14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompilerIntelligence {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
//        Apple a = flist.get(0);
        flist.contains(new Apple());
        flist.indexOf(new Apple());
    }
}
