package mid2.collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String,String> dictionary = new HashMap<>();
        while (true) {
            System.out.println("==단어 입력 단계==");
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String key = sc.nextLine();
            if (key.equals("q")) {
                break;
            }
            System.out.print("한글 단어를 입력하세요 (종료는 'q'): ");
            String value = sc.nextLine();
            dictionary.put(key, value);
        }

        while (true) {
            System.out.println("==단어 입력 단계==");
            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String key = sc.nextLine();
            if (key.equals("q")) {
                break;
            }
            String value = dictionary.get(key);
            if (dictionary.containsKey(key)) {
                System.out.println(key + "의 뜻: " + value);
            }else{
                System.out.println(key+"은(는) 없는 단어입니다.");
            }
        }
    }
}
