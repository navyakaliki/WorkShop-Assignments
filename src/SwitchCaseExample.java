import java.time.LocalDateTime;

public class SwitchCaseExample {
    public static void main(String[] s) {
        LocalDateTime x = LocalDateTime.now();
        String y = x.getDayOfWeek().toString();
        System.out.println("It is a "+y);
        switch(y) {
            case "MONDAY" :     System.out.println("It is the first day of the week!");
                break;
            case "TUESDAY" :    System.out.println("It is the second day of the week!");
                break;
            case "WEDNESDAY" :  System.out.println("Mid-week already!");
                break;
            case "THURSDAY" :   System.out.println("One more day before you say TGIF");
                break;
            case "FRIDAY" :     System.out.println("Hurray! The last day of the work week");
                break;
            case "SATURDAY" :   System.out.println("Weekend! Blissful!");
                break;
            case "SUNDAY" :     System.out.println("Make hay while the Sun(day) shines!");
        }
    }
}