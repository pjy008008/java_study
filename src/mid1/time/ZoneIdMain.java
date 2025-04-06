package mid1.time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {
    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId+"|"+zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("zoneId.systemDefault = " + zoneId);

        ZoneId souelZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("souelZoneId = " + souelZoneId);
    }
}
