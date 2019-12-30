import java.time.LocalDate;
import java.time.LocalTime;
class Test31
{
   public static void main (String[] args)
   {
      LocalDate doj = LocalDate.of(95,10,12);
      LocalTime time = LocalTime.now();
System.out.println(doj.getDayOfMonth()+"/"+doj.getMonthValue()+"/"+doj.getYear());
System.out.println(time.getHour()+":"+time.getMinute()+":"+time.getSecond());
}
}