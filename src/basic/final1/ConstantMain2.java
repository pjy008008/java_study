package basic.final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("최대 참여자 수: "+ Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);
    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수: " + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자 등록");
        } else {
            System.out.println("게임 참여");
        }
    }
}
