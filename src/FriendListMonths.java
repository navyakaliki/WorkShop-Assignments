import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class FriendListMonths {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        TreeSet<Friend> friendList= new TreeSet<>();
        boolean loopforever=true;
        while(loopforever) {
            System.out.println("enter Friend's Name");
            String name = scanner.nextLine();
            System.out.println("Enter the Date of Birth:");
            String dob = scanner.nextLine();
            String[] mydobarr = dob.split("/");
            LocalDate actualDate = LocalDate.of(Integer.parseInt(mydobarr[2]),
                    Integer.parseInt(mydobarr[1]),
                    Integer.parseInt(mydobarr[0]));
            System.out.println("Enter phonenumber");
            double phone = Double.parseDouble(scanner.nextLine());
            friendList.add(new Friend(name, actualDate, phone));
            System.out.println("Do you want to continue?");
            loopforever = scanner.nextLine().equalsIgnoreCase("Y");
        }
        System.out.println("Enter the month for birthdays");
        String month=(scanner.nextLine());
        List listOne = friendList.stream().filter(s -> {
            return s.dob.getMonth().name().equalsIgnoreCase(month);
        }).collect(Collectors.toList());
        listOne.forEach(s -> {
            System.out.println(s);
        });

    }
}
