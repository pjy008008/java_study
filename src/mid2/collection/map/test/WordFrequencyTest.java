package mid2.collection.map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WordFrequencyTest {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";
        String[] list = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String string : list) {
            if (!map.containsKey(string)) {
                map.put(string, 1);
            }else{
                int value = map.get(string);
                map.put(string, ++value);
            }
        }
        System.out.println(map);
    }
}
