import java.util.ArrayList;
import java.util.Scanner;

public class BinaryConvert {

    public static void main(String[] args)
    {

        int i = 0;
        Scanner scanner=new  Scanner(System.in);
        ArrayList<Integer> binaryNum = new ArrayList<>();
        System.out.println("enter number between 10-20");
        int n=Integer.parseInt(scanner.nextLine());
        System.out.println(Integer.toBinaryString(n));

    }
}