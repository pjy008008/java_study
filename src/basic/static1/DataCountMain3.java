package basic.static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count= "+Data3.count);
        Data3 data2 = new Data3("B");
        System.out.println("B count= "+Data3.count);
        Data3 data3 = new Data3("C");
        System.out.println("C count= "+Data3.count);

        //인스턴스를 통한 접근 권장하지 않음, 인스턴스 변수라고 생각할 수 있기 때문
//        Data3 data4 = new Data3("D");
//        System.out.println("d count= "+data4.count);
    }
}
