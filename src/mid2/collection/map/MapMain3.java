package mid2.collection.map;

import java.util.HashMap;

public class MapMain3 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        //학생이 없는 경우에만 추가
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }
        //키가 있으므로 추가되지 않는다
        System.out.println(studentMap);

        //Absent하면 put한다.
        studentMap.putIfAbsent("studentA", 100);
        studentMap.putIfAbsent("studentB", 100);
        System.out.println(studentMap);
    }
}
