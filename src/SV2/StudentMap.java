package SV2;

import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class StudentMap {
    HashMap<String, Double> map;

    public LinkedList<String> outputStudents() {
        LinkedList<String> students = new LinkedList<String>();
        for (String key : map.keySet()) {
            students.add(key);
        }
        students.sort(null);
        return students;
    }

    public LinkedList<String> topPercent(double percentage) {
        int topPercent = (int) Math.floor(percentage / 100 * map.size());
        LinkedList<Map.Entry<String, Double>> entries = new LinkedList<>(map.entrySet());
        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        LinkedList<String> output = new LinkedList<String>();
        for (int i = 0; i < topPercent; i++) {
            output.add(entries.get(i).getKey());
        }
        return output;
    }

    public double getMedian() {
        int middle = (int) Math.floor(map.size() / 2);
        LinkedList<Map.Entry<String, Double>> entries = new LinkedList<>(map.entrySet());
        entries.sort((a, b) -> b.getValue().compareTo(a.getValue()));
        return entries.get(middle).getValue();
    }
}
