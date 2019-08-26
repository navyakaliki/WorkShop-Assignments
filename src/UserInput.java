import java.util.Scanner;

public class UserInput {
    public static void main(String s[]) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = myScanner.nextLine();
        System.out.println("Hello "+name);
    }
}
