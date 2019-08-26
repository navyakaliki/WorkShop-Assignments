import java.time.LocalDateTime;
public class PrintDateAndTime {
    public static void main(String s[]) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getDayOfMonth() +
                " "+ localDateTime.getMonth()+
                " "+ localDateTime.getYear());
    }
}
