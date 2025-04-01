package mid1.lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;

        //사용자의 입력을 받으면 동적으로도 객체가 생성 가능함.
//        Class helloClass = Class.forName("mid.lang.clazz.Hello");

        //Class 클래스를 사용해 객체를 생성할 수 있다.(Reflection)
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);
    }
}
