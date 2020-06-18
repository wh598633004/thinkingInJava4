package chapter15;

import java.util.EnumSet;
import java.util.Set;

public class WatercolorSets {
    public static void main(String[] args) {
        Set<Watercolors> set1 = EnumSet.range(Watercolors.A, Watercolors.G);
        Set<Watercolors> set2 = EnumSet.range(Watercolors.C, Watercolors.Z);
        System.out.println("set1:" + set1);
        System.out.println("set2:" + set2);
        Set<Watercolors> subset = Sets.intersection(set1, set2);
        System.out.println("intersection(set1, set2):" + subset);

        System.out.println("difference(set1, subset):" + Sets.difference(set1, subset));
        System.out.println("difference(set2, subset):" + Sets.difference(set2, subset));
        System.out.println("complement(set1, set2):" + Sets.complement(set1, set2));
    }
}
