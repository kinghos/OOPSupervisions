package SV1;

public class lowestCommonClass {

    public static int lowestCommon(long x, long y) {

        // [James] this is gloriously inefficient
        //processing through Strings instead of bitwise operation is an interesting choice....

        /*
        Consider instead
        long both = x & y;
        int retValue = -1;
        while (i < 64) {
            if (((both >> i) & 1) > 0) {
                return i;
                break;
            }
        }
         */

        String binStringX = Long.toBinaryString(x);
        String binStringY = Long.toBinaryString(y);
        System.out.println(binStringX + " " + binStringY);

        int i = 1;
        int lenX = binStringX.length();
        int lenY = binStringY.length();
        int smaller = Math.min(lenX, lenY);

        boolean foundFlag = false;
        while (i <= smaller) {
            if (lenX - i < 0 || lenY - i < 0) {
                break;
            }
            if (binStringX.charAt(lenX-i) == binStringY.charAt(lenY-i) && binStringX.charAt(lenX-i) == '1')  {
                foundFlag = true;
                break;
            }
            i++;
        }
        if (foundFlag) {
            return i-1;
        } else {
            return -1;

        }
    }

    public static void main(String[] args) {
        System.out.println(lowestCommon(14, 25));
    }
}
