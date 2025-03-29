package basic.ref.ex;


public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        productOrders[0] = createProductOrder("두부", 2000, 2);
        productOrders[1]= createProductOrder("김치", 5000, 1);
        productOrders[2]= createProductOrder("콜라", 1500, 2);

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
