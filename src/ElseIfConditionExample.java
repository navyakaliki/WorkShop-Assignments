import java.time.LocalDateTime;
public class ElseIfConditionExample {
    public static void main(String[] s) {
        LocalDateTime localDateTime = LocalDateTime.now();
        String dayOfWeek = localDateTime.getDayOfWeek().toString();
        if(dayOfWeek.equalsIgnoreCase("Monday")) {
            System.out.println("It is the first day of the week!");
        } else if (dayOfWeek.equalsIgnoreCase("Tuesday")) {
            System.out.println("It is the second day of the week!");
        } else if (dayOfWeek.equalsIgnoreCase("Wednesday")) {
            System.out.println("Mid-week already!");
        } else if (dayOfWeek.equalsIgnoreCase("Thursday")) {
            System.out.println("One more day before you say TGIF");
        } else if (dayOfWeek.equalsIgnoreCase("Friday")) {
            System.out.println("Hurray! The last day of the work week");
        } else if (dayOfWeek.equalsIgnoreCase("Saturday")) {
            System.out.println("Weekend! Blissful!");
        } else if (dayOfWeek.equalsIgnoreCase("Sunday")) {
            System.out.println("Make hay while the Sun(day) shines!");
        }

    }
}