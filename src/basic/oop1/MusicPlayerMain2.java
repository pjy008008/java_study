package basic.oop1;

public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn=true;
        System.out.println("음악 플레이어 시작");
    }

    static void off(MusicPlayerData data) {
        data.isOn=false;
        System.out.println("음악 플레이어 종료");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("볼륨 = " + data.volume);
    }
    static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("볼륨 = " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태");
        if(data.isOn) {
            System.out.println("음악 플레이어 on, 볼륨: " + data.volume);
        }
        else {
            System.out.println("음악 플레이어 off");
        }
    }
}
