package mid2.generic.test.ex1;

public class Container <T> {
    private T value;
    public T getItem(){
        return value;
    }
    public void setItem(T value) {
        this.value = value;
    }
    public boolean isEmpty() {
        return value == null;
    }

}
