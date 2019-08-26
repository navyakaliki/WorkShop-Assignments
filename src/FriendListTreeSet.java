import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TreeSet;

public class FriendListTreeSet {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TreeSet<Friend> friendList= new TreeSet<>();
        boolean loopforever=true;
        while(loopforever) {
            System.out.println("enter Friend's Name");
            String name = scanner.nextLine();
            System.out.println("Enter the Date of Birth:");
             String dob=scanner.nextLine();
             String[] mydobarr=dob.split("/");
             LocalDate actualDate=LocalDate.of(Integer.parseInt(mydobarr[2]),
                     Integer.parseInt(mydobarr[1]),
                             Integer.parseInt(mydobarr[0]));
             System.out.println("Enter phonenumber");
            double phone = Double.parseDouble(scanner.nextLine());
            friendList.add(new Friend(name,actualDate,phone));
            System.out.println("Do you want to continue?");
            loopforever = scanner.nextLine().equalsIgnoreCase("Y");
        }
            friendList.forEach(s->{
                System.out.println(s);
            });
    }
}
