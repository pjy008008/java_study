package basic.final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();
        // data = new Data(); 에러

        //참조 대상의 값은 변경 가능하다(final은 참조값을 변경 못하게 하는 상태, 가리키는 대상을 못바꿈)
        data.value=10;
        System.out.println(data.value);
        data.value=20;
        System.out.println(data.value);
    }
}
