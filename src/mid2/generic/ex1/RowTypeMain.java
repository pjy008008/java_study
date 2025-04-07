package mid2.generic.ex1;

public class RowTypeMain {
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox();
        //위의 코드는 아래의 코드와 같은 의미를 가진다. <>없이 선언할경우 타입으로 Object를 사용함
        //이걸 row type이라고 함, 하위 버전과의 호환을 위해 있는 것임
        GenericBox<Object> integerBox2 = new GenericBox<>();
    }
}
