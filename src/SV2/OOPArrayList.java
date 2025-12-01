package SV2;

import java.util.Arrays;

public class OOPArrayList implements OOPList {
    int[] array;

    @Override
    public int valAt(int i) {
        return array[i];
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public void add(int val) {
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1] = val;
    }
}
