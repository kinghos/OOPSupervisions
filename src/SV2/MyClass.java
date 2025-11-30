package SV2;

import java.util.Arrays;

public class MyClass implements Cloneable {
    private String mName;
    private int [] mData;
    // Copy constructor
    public MyClass ( MyClass toCopy ) {
        this.mName = toCopy.mName;
        this.mData = Arrays.copyOf(toCopy.mData, toCopy.mData.length);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        MyClass copy = (MyClass) super.clone();
        copy.mName = mName;
        copy.mData = Arrays.copyOf(mData, mData.length);
        return copy;
    }
}
