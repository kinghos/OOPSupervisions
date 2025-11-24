package SV1;

import java.util.Arrays;

public class Matrices {

    public static float[][] generateUnitMatrix(int n) {
        float[][] output = new float[n][n];
        int unitCount = 0;
        for (int row = 0; row < n; row++) {
            float[] rowVals = new float[n];
            for (int col = 0; col < n; col++) {
                if (col == unitCount) {
                    rowVals[col] = 1;
                    continue;
                }
                rowVals[col] = 0;
            }
            unitCount++;
            output[row] = rowVals;
        }

        return output;
    }

    // [James] coudl also have a void return type
    public static float[][] transpose(float[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = row + 1; col < matrix.length; col++) {
                float temp = matrix[row][col];
                matrix[row][col] = matrix[col][row];
                matrix[col][row] = temp;
            }
        }
        return matrix;
    }

    static void main() {
        float[][] ar = transpose(generateUnitMatrix(3));
        for (float[] as : ar) {
            System.out.println(Arrays.toString(as));
        }
    }
}
