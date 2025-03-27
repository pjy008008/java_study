package ref.ex;


import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("수량 입력: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] productOrders = new ProductOrder[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            String name = scanner.nextLine();
            System.out.print("가격: ");
            int price = scanner.nextInt();
            System.out.print("수량: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();
            productOrders[i]= createProductOrder(name,price,quantity);
        }
        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결재금액: "+totalAmount);
   }

    public static ProductOrder createProductOrder(String name, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName=name;
        order.price=price;
        order.quantity=quantity;
        return order;
    }
    public static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
        }
    }
    public static int getTotalAmount(ProductOrder[] orders){
        int sum=0;
        for (ProductOrder order : orders) {
            sum+=order.price*order.quantity;
        }
        return sum;
    }
}
