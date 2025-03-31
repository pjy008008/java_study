package mid1.lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        //가변 메서드들은 반환값을 받을 필요가 없다!!!
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java");
        System.out.println("sb = " + sb);

        sb.delete(4, 8);
        System.out.println("delete: "+sb);

        sb.reverse();
        System.out.println("reverse: "+sb);

        //StringBuilder -> String
        String string = sb.toString();
        System.out.println("string = "+string);

    }
}
