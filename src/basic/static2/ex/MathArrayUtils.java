package basic.static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        //생성자를 생성 못하게 막음
    }
    public static int sum(int[] array) {
        int sum=0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }

    public static double average(int[] array) {
        int sum = sum(array);
        double average = (double)sum/array.length;
        return average;
    }

    public static int min(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}
