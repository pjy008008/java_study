package mid2.collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size=0;

    public void add(Object e) {
        Node newNode = new Node(e);
        if (first == null) {
            first = newNode;
        }else{
            Node lastNode = getLastNode();
            lastNode.next = newNode;
        }
        size++;
    }

    //추가 코드
    public void add(int index, Object object) {
        Node newNode = new Node(object);
        if(index==0){
            newNode.next = first;
            first = newNode;
        }else{
            Node prev = getNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
        }
        size++;
    }

    //추가 코드
    public Object remove(int index) {
        Object removedItem = getNode(index).item;
        if (index == 0) {
            first = first.next;
        }else{
            Node prev = getNode(index - 1);
            prev.next = getNode(index + 1);
        }
        size--;
        return removedItem;
    }
    private Node getLastNode() {
        Node x=first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }
    public Object set(int index, Object object) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = object;
        return oldValue;
    }

    public Object get(int index) {
        return getNode(index).item;
    }
    private Node getNode(int index) {
        Node x =first;
        for (int i = 0; i < index; i++) {
            x=x.next;
        }
        return x;
    }

    public int indexOf(Object o) {
        int index=0;
        Node x = first;
        while (x != null) {
            if (x.item.equals(o)) {
                return index;
            }
            x = x.next;
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
