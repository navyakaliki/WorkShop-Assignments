
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListadd<S> {
    public static void main(String[] args) {
        String response = "y";
        ArrayList<String> al = new ArrayList<String>();
        Scanner userInput = new Scanner(System.in);
        do {
            System.out.println("ENTER STRING");
            String input = userInput.nextLine();

            if(al.contains(input))
            {
                System.out.println("already exists");
            }
            else
            {
                al.add(input);
            }
            System.out.println(al);
            System.out.println("do you wish to cont...");
            response=userInput.nextLine();
        } while (response.equalsIgnoreCase("y"));


    }
    }
