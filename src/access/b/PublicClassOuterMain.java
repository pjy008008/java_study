package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        //다른 패키지에 있기 때문에 안됨
        //DefaultClass1 class1 = new DefaultClass1();
    }
}
