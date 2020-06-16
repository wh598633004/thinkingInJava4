package chapter14;

import java.awt.*;

class HoldItem<T> {
    T item;
    HoldItem(T item) {
        this.item = item;
    }
    T getItem() {
        return item;
    }
}
class Colored2<T extends HasColor> extends HoldItem<T> {

    Colored2(T item) {
        super(item);
    }
    Color getColor() {
        return item.getColor();
    }
}
class ColoredDimension2<T extends Dimension & HasColor> extends Colored2<T> {

    ColoredDimension2(T item) {
        super(item);
    }
    int getX() {
        return item.x;
    }
    int getY() {
        return item.y;
    }
    int getZ() {
        return item.z;
    }
}
class Solid2<T extends Dimension & HasColor > extends ColoredDimension2<T> {

    Solid2(T item) {
        super(item);
    }
}
public class InheritBounds {
}
