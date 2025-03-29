package basic.final1;

public class FinalFieldMain {
    public static void main(String[] args) {

        //Constructor Initialize
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println(constructInit1.value);
        System.out.println(constructInit2.value);

        //Field Initialize
        //인스턴스마다 같은 값을 사용하기 때문에 메모리를 낭비함, 상수를 쓰는 게 좋음
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);


        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);
    }
}
