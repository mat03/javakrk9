package zaj2;

import java.util.Comparator;

public class CompareDistansColorPoint3d implements Comparator<ColorPoint3d> {
    @Override
    public int compare(ColorPoint3d o1, ColorPoint3d o2) {
        Double rez1 =  Math.pow(Math.pow(o1.x,2.0) + Math.pow(o1.y,2.0) + Math.pow(o1.z, 2.0),0.5);
        Double rez2 =  Math.pow(Math.pow(o2.x,2.0) + Math.pow(o2.y,2.0) + Math.pow(o2.z, 2.0),0.5);

        if(rez1 > rez2) {
            return 1;
        }
        return -1;
    }
}
