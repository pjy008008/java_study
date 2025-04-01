package mid1.lang.math.test;

public class LottoMain {
    public static void main(String[] args) {
        Lottogenerator lottogenerator = new Lottogenerator();
        int[] arr;
        arr = lottogenerator.generate();
        System.out.print("로또 숫자");
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}
