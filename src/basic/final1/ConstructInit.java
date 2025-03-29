package basic.final1;

public class ConstructInit {
    final int value; //초기값 없을 시 생성자 사용

    public ConstructInit(int value) {
        this.value = value; // 생성 시에만 초기화 가능
    }
}
