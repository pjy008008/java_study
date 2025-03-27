package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] productOrders = new ProductOrder[3];
        int sum=0;

        ProductOrder first = new ProductOrder();
        first.productName = "두부";
        first.price=2000;
        first.quantity=2;
        productOrders[0]= first;

        ProductOrder second = new ProductOrder();
        second.productName = "김치";
        second.price = 5000;
        second.quantity = 1;
        productOrders[1]= second;

        ProductOrder third = new ProductOrder();
        third.productName = "콜라";
        third.price = 1500;
        third.quantity=2;
        productOrders[2]= third;

        for (ProductOrder productOrder : productOrders) {
            sum+=productOrder.price*productOrder.quantity;
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
        }
        System.out.println("총 결재금액: "+sum);
   }
}
