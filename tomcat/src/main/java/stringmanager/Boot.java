package stringmanager;







import org.apache.tomcat.util.res.StringManager;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.WeekFields;
import java.util.Locale;

/**
 * @author xutong
 */
public class Boot {
    public static void main(String[] args) {
//        System.out.println(System.getProperties().get("user.language"));
//        StringManager manager = StringManager.getManager("stringmanager.properties", Locale.CHINESE);
//        System.out.println(manager.getLocale());
//
//        System.out.println(manager.getString("xty"));
        LocalDateTime now = LocalDateTime.now();
        int weekOfWeekyear = now.get(WeekFields.of(DayOfWeek.MONDAY, 1).weekOfYear());
        System.out.println(now.plusDays(7 - now.getDayOfWeek().getValue()));
        System.out.println(now.minusDays( now.getDayOfWeek().getValue()-1));
        System.out.println(weekOfWeekyear);
        System.out.println(now.getDayOfYear());
    }
}
