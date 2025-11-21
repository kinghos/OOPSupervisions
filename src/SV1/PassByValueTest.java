package SV1;

import java.util.Arrays;

public class PassByValueTest {
    public static void modifyArray(int[] a) {
        a[0] = 4;
    }
    public static void reassignRef(int[] a) {
        a = new int[] {1, 2, 3};
    }
    public static void main(String args[]) {
        int[] test = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(test));

        modifyArray(test);
        System.out.println(Arrays.toString(test));
        reassignRef(test);
        System.out.println(Arrays.toString(test));

    }
}
