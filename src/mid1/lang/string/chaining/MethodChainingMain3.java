package mid1.lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        //Chain과 같이 이어서 쓸 수 있기 때문에 Chaining Method 라고 부름
        int result = adder.add(1).add(2).add(3).getValue();

        System.out.println("result = " + result);
    }
}
