package SV2;

import java.io.*;
import java.util.*;

public class IntegerFileRead {


    public static void main(String[] args) {
        String filename = "/home/kingshuk/Documents/Uni/supervisions/OOP_1/java/src/SV2/data.txt";
        ArrayList<int[]> nums = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] cols = line.split(",");

                int a = Integer.parseInt(cols[0].trim());
                int b = Integer.parseInt(cols[1].trim());

                nums.add(new int[] {a, b});
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        Collections.sort(nums, new PairComparator());

        for (int[] xs : nums) {
            System.out.println(xs[0] + ", " + xs[1]);
        }
    }
}

class PairComparator implements Comparator<int[]> {
    public int compare(int[] p1, int[] p2) {
        int result = Integer.compare(p1[0], p2[0]);

        if (result != 0) {
            return result;
        }

        return Integer.compare(p1[1], p2[1]);
    }
}