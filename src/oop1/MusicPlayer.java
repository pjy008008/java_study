package oop1;

public class MusicPlayer {
    int volume;
    boolean isOn;
    void on(){
        isOn=true;
        System.out.println("음악 플레이어 시작");
    }
    void off(){
        isOn=false;
        System.out.println("음악 플레이어 종료");
    }

    void volumeUp() {
        volume++;
        System.out.println("볼륨 = " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("볼륨 = " + volume);
    }
    void showStatus() {
        System.out.println("음악 플레이어 상태");
        if(isOn) {
            System.out.println("음악 플레이어 on, 볼륨: " + volume);
        }
        else {
            System.out.println("음악 플레이어 off");
        }
    }
}
