package zaj2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class PointsHelper {
    static public boolean uniquePoints(ColorPoint3d []points) {
        Set<ColorPoint3d> setOfPoints = new HashSet<>();

        for (ColorPoint3d singlePolint: points) {
            if(setOfPoints.contains(singlePolint)) {
                return false;
            } else {
                setOfPoints.add(singlePolint);
            }

        }

        return true;
    }

    public static Set<ColorPoint3d> convert(ColorPoint3d[] points) {
        TreeSet<ColorPoint3d> sorted = new TreeSet<>(new CompareDistansColorPoint3d());
        for (ColorPoint3d singlePoint: points) {
            sorted.add(singlePoint);
        }

        return  sorted;
    }
}
