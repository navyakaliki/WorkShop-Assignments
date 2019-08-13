import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        String inputString;
        Scanner in = new Scanner(System.in);

        System.out.println("Input a string");
        inputString = in.nextLine();

        int length = inputString.length();
        int i, start, end, middle;

        start = 0;
        end = length - 1;
        middle = (start + end) / 2;

        for (i = start; i <= middle; i++) {
            if (inputString.charAt(start)==inputString.charAt(end)) {
                start++;
                end--;

            } else {
                System.out.println("not palindrome");
                System.exit(0);

            }

        }
        System.out.println("Palindrome");

    }

    }
