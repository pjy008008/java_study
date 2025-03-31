package mid1.lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        //Do not use return value, you should redeclare the Object
        System.out.println("obj1 = " + obj1.getValue());
    }
}
