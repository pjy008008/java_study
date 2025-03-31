package mid1.lang.string.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        String result = "";
        //최적화를 하지만, for문 내부에서 StringBuilder의 생성과 String생성이 계속되기 때문에 최적화 어려움
        for (int i = 0; i < 100000; i++) {
            result += "Hello Java";
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime - startTime)+"ms");
    }
}
