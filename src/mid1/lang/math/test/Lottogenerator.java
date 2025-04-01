package mid1.lang.math.test;

import java.util.Random;

public class Lottogenerator {
    private final Random random = new Random();
    private int[] lottonums;
    private int count;

    public int[] generate() {
        lottonums = new int[6];
        count=0;
        while (count < 6) {
            boolean isDuplicate = false;
            int num = random.nextInt(45)+1;

            for (int i = 0; i < count; i++) {
                if(num==lottonums[i]){
                    isDuplicate=true;
                    break;
                }
            }
            if(!isDuplicate){
                lottonums[count]=num;
                count++;
            }
        }
        return lottonums;
    }
}
