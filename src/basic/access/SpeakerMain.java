package basic.access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드 직접 접근
        System.out.println("직접수정");
        // speaker.volume=200;
        speaker.showVolume();
    }
}
