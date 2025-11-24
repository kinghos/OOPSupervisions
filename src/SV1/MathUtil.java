package SV1;

public class MathUtil {
    public int max(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }

    // [James] all good, but also note the Java ternary operator:
    // return x > y ? x : y;
    public double max(double x, double y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }
    }
}
