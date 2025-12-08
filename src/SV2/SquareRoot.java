package SV2;

class NegativeSqrt extends Exception {};

public class SquareRoot {
    final static int iterations = 10;

    public static double sqrt(double n) throws NegativeSqrt{
        if (n < 0) {
            throw new NegativeSqrt();
        }

        double result = 1;
        // [James] Much better than a fixed number of iterations is to have some threshold and check for the difference
        // between successive iterations
        for (int i = 0; i < iterations; i++) {
            result = 0.5 * (result + (n / result));
        }
        assert (result >= 0.0);
        return result;
    }

}
