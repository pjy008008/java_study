package mid1.exception.basic.unchecked;

//RuntimeException을 상속받으면 언체크 예외가 된다.
public class MyUncheckedException extends RuntimeException {
    public MyUncheckedException(String message) {
        super(message);
    }
}
