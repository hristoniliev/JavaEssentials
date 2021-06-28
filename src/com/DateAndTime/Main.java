package com.DateAndTime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime nowZDT =  ZonedDateTime.now();
        LocalDateTime nowLDT = LocalDateTime.now();
        LocalDate nowLD = LocalDate.now();
        LocalTime nowLT = LocalTime.now();
        Instant instant = Instant.now();
        System.out.println(nowZDT);
        System.out.println(nowLDT);
        System.out.println(nowLD);
        System.out.println(nowLT);
        System.out.println(instant);

        LocalDateTime localDate = LocalDateTime.now(ZoneId.of("Australia/West"));
        System.out.println(localDate);//See the time in Australia.
        LocalDate someDate = LocalDate.of(1998, Month.AUGUST, 31);
        System.out.println(someDate.minus(2, ChronoUnit.DECADES));
        System.out.println(someDate.isBefore(nowZDT.toLocalDate()));
        System.out.println("Your are born on "+ someDate+"->"+ someDate.getDayOfWeek());
        System.out.println(someDate.minus(2, ChronoUnit.DECADES).getDayOfWeek());
        System.out.println(someDate.minus(2, ChronoUnit.DECADES).getMonth());
        System.out.println(someDate.minus(2, ChronoUnit.DECADES).getYear());
    }
}
