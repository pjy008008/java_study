package basic.final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("최대 참여자 수: "+ 1000);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > 1000) {
            System.out.println("대기자 등록");
        } else {
            System.out.println("게임 참여");
        }
    }
}
