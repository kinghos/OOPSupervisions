package SV2;

import java.awt.*;

public final class Point3D implements Comparable<Point3D>{
    private int x;
    private int y;
    private int z;

    @Override
    public int compareTo(Point3D o) {
        int zCompare = Integer.compare(this.z, o.z);
        if (zCompare != 0) {
            return zCompare;
        }

        int yCompare = Integer.compare(this.y, o.y);
        if (yCompare != 0) {
            return yCompare;
        }

        return Integer.compare(this.x, o.x);
    }
}
