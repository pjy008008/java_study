package mid2.collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);
        set.add("A");
        set.add("B");
        set.add("C");
        System.out.println(set);

        //search
        String searchValue = "A";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains("+searchValue+") = "+result);

        MySet<Integer> set2 = new MyHashSetV3<>(10);
        set2.add(10);
        set2.add(2);
        System.out.println(set2);
    }
}
