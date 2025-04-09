package mid2.collection.compare.test;

public enum CardType {

    SPADE("♠",0)
    ,HEART("♥",1)
    ,DIAMOND("♦",2)
    , CLOVER("♣",3);
    private final String type;
    private final int priority;
    CardType(String type, int priority) {
        this.type = type;
        this.priority = priority;
    }

    public String getCardShape() {
        return type;
    }
    public int getPriority() {
        return priority;
    }
}
