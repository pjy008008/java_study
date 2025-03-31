package mid1.lang.string.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder("");
        //최적화를 하지만, for문 내부에서 StringBuilder의 생성과 String생성이 계속되기 때문에 최적화 어려움
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java ");
        }
        long endTime = System.currentTimeMillis();

        String str = sb.toString();
        System.out.println("result = " + str);
        System.out.println("time = " + (endTime - startTime)+"ms");
        //Java가 최적화를 지원하기 때문에 보통은 그냥 +연산을 쓰면 되지만 위와 같은 경우는 StringBuilder 사용
        //StringBuffer는 동기화 문제가 나지 않게 보장하지만, 동기화 연산에 오버헤드가 있음
        //StringBuilder는 동기화 문제가 발생 가능, 멀티쓰레드 상황 시
    }
}
