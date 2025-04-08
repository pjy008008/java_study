package mid2.collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int totalPrice=0;
        for (Item item : items) {
            totalPrice += item.getTotalPrice();
            System.out.println("상품명:" + item.getName() + ", 합계:" + item.getTotalPrice());
        }
        System.out.println("전체 상품 합:" + totalPrice);
    }
}
