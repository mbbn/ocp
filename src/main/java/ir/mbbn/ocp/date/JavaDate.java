package ir.mbbn.ocp.date;

import java.time.*;
import java.util.Date;

public class JavaDate {

    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        var zone = ZoneId.systemDefault();
        System.out.println(zone);

        System.out.println(Instant.now());

        Instant instant = new Date().toInstant();
        var zoneDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println(zoneDateTime);
    }
}
