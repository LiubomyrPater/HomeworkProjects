package timeDateCalendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public abstract class Converting{


    public static LocalDate dateToLocalDate(Date date){
        int month = date.getMonth();
        if(month == 0){
            month += 12;
        }
        return LocalDate.of(date.getYear(),month,date.getDate());
    }

    public static LocalTime dateToLocalTime(Date date){
        return LocalTime.of(date.getHours(), date.getMinutes(), date.getSeconds());
    }

    public static LocalDateTime dateToLocalDateTime(Date date){
        int month = date.getMonth();
        if(month == 0){
            month += 12;
        }
        return LocalDateTime.of(date.getYear(), month, date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds());
    }

    public static Object multipurpose(Date date, String variant){
        int month = date.getMonth();
        if(month == 0)
            month += 12;

        if (variant.equalsIgnoreCase("LocalDate")){
            return LocalDate.of(date.getYear(),month,date.getDate());
        }else if (variant.equalsIgnoreCase("LocalTime")){
            return LocalTime.of(date.getHours(), date.getMinutes(), date.getSeconds());
        }else if (variant.equalsIgnoreCase("LocalDateTime")){
            return LocalDateTime.of(date.getYear(), month, date.getDate(), date.getHours(), date.getMinutes(), date.getSeconds());
        }else {
            return null;
        }
    }
}
