import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {

        String response;
        do {
            System.out.println("Would you like to check if a Number is a perfect Square? y or n:");
            Scanner userInput = new Scanner(System.in);
            response = userInput.nextLine();
            System.out.println("Enter the number");
            Scanner number = new Scanner(System.in);
            int n1 = Integer.parseInt(number.nextLine());
            double sqrt =  Math.sqrt(n1);
            if (sqrt * sqrt == n1) {
                System.out.println("Yes, the given number is a perfect Square");
            } else {
                System.out.println("No, the given number is not a perfect Square");
            }

        } while (response.equalsIgnoreCase("y"));
    }
}