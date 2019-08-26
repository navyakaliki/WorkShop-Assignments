import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class FriendReaderlist {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the File name");
            try {
                FileInputStream fileInput = new FileInputStream(scanner.nextLine());
                Scanner filescanner = new Scanner(fileInput);
                ArrayList<Friend> friendArray = new ArrayList<>();
                while (filescanner.hasNext()) {
                    String[] filelienArr = filescanner.nextLine().split(",");
                    String name = filelienArr[0];
                    String dob = filelienArr[1];
                    String[] mydobarr =filelienArr[2].split("/");
                    LocalDate dobnew = LocalDate.of(Integer.parseInt(mydobarr[2]),
                            Integer.parseInt(mydobarr[1]),
                            Integer.parseInt(mydobarr[0]));
                    String phoneNumber = filelienArr[2];
                    Friend frn = new Friend(name, dob, phoneNumber);
                }
                friendArray.forEach(s->
                {
                    System.out.println(s);
                });
            }catch (FileNotFoundException e) {
                System.out.println("invalid file name");
            }
    }
}
