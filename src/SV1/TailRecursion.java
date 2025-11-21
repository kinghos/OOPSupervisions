package SV1;

public class TailRecursion {
    public int pow_tail(int x, int n, int acc) {
        if (n==0) {
            return 1;
        } else if (n == 1) {
            return acc;
        }
        return pow_tail(x, n-1, x*n);
    }
    public int pow(int x, int n) {
        if (n==0) {
            return 1;
        } else if (n == 1) {
            return x;
        }
        return x * pow(x, n-1);
    }
}
