package timeDateCalendar;

import java.time.LocalTime;
import java.util.Date;
/**
 Створити метод який дозволить конвертувати дату з
 Date --> LocalDate.
 Date --> LocalTime,
 Date --> LocaldateTime
 */
public class Main {
    public static void main(String[] args) {

        Date date = new Date(2015, 12,3, 20,34,26);


//        System.out.println(Converting.dateToLocalDate(date));
//
//        System.out.println(Converting.dateToLocalTime(date));
//
//        System.out.println(Converting.dateToLocalDateTime(date));

        System.out.println(Converting.multipurpose(date, "LocalDateTime"));

    }
}
