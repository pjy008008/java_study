package ref;

public class NullMain4 {
    public static void main(String[] args) {
        BigData bigData = new BigData();
        bigData.data = new Data();
        System.out.println("bigData.count = " + bigData.count); //int형은 0이 들어간다
        System.out.println("bigData.data = " + bigData.data); //참조형은 null이 들어간다


        //NullPointerException
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
