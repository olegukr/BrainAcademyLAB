package lab_2_11.lab_2_11_4;

import java.util.Comparator;

/**
 * Created by olegpoberezhets on 04.03.17.
 */

public class ShapeColorComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Shape shape1 = (Shape) o1;
        Shape shape2 = (Shape) o2;
        return shape1.getShapeColor().compareTo(shape2.getShapeColor());
    }
}
