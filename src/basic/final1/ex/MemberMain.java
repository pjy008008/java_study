package basic.final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "Park");
        member.print();
        member.changeData("myId2", "Park2");
        member.print();
    }
}
