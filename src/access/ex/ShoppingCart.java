package access.ex;

public class ShoppingCart {
    private Item[] items = new Item[10];
    private int count=0;
    public void addItem(Item item) {
        if(isOver()){
            System.out.println("장바구니가 가득 찼습니다");
            return;
        }
        items[count] = item;
        count++;
    }

    private boolean isOver() {
        return count>=items.length;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        int total=0;
        for (int i=0;i<count;i++) {
            total+=items[i].getTotalPrice();
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());
        }
        System.out.println("전 가격 합: "+total);
    }
}
