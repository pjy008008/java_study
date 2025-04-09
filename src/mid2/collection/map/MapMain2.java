package mid2.collection.map;

import java.util.HashMap;

public class MapMain2 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100); //같은 key가 들어가면 value가 교체된다.
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("studentA"); //key가 존재하는지 확인
        System.out.println("containsKey = " + containsKey);

        studentMap.remove("studentA"); //삭제
        System.out.println(studentMap);
    }
}
