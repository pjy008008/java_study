package mid1.lang.wrapper;

public class WrapperVsPrimitive {
    public static void main(String[] args) {
        int iterations = 1_000_000_000;
        long starTime,endTime;

        long sumPrimitive = 0;
        starTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumPrimitive += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumPrimitive = " + sumPrimitive);
        System.out.println("시간: " + (endTime - starTime) + "ms");

        Long sumWrapper = 0L;
        starTime = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            sumWrapper += i;
        }
        endTime = System.currentTimeMillis();
        System.out.println("sumWrapper = " + sumPrimitive);
        System.out.println("시간: " + (endTime - starTime) + "ms");
    }
}
