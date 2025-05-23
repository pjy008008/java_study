package mid1.lang.string.method;

public class StringSplitJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split
        String[] splitStr = str.split(",");
        for (String s : splitStr) {
            System.out.println(s);
        }

        //join만들기 어려운 문제가 있음
        String joinStr = "";
        for (String s : splitStr) {
            joinStr += s + "-";
        }
        System.out.println("joinStr = " + joinStr);

        //join
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열 = " + joinedStr);

        String result = String.join("-", splitStr);
        System.out.println("result = " + result);
    }
}
