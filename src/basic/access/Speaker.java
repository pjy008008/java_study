package basic.access;

public class Speaker {
    private int volume;

    Speaker(int volume) {
        this.volume=volume;
    }

    void volumeUp() {
        if (volume >= 100) {
            System.out.println("음량 증가할 수 없음. 최대음량");
        }else{
            volume+=10;
            System.out.println("볼륨 10증가");
        }
    }

    void volumeDown() {
        volume-=10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재음량: "+volume);
    }
    //private 같은 클래스
    //default 같은 패키지
    //protected 상속 관계
    //public 전부 허용
}
