package mid1.lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재시간 밀리초
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재시간 나노초
        long currentNano = System.nanoTime();
        System.out.println("currentNano = " + currentNano);

        //환경 변수 읽기
        System.out.println("getenv = "+System.getenv());

        //시스템 속성
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        //배열을 고속으로 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);

        //출력
        System.out.println("copiedArray = " + Arrays.toString(copiedArray));

        //프로그램 종료(웹 애플리케이션 같은 곳에서는 가급적 쓰지 않는다.)
        System.exit(0);

        //hello는 출력이 되지 않는다
        System.out.println("hello");
    }
}
