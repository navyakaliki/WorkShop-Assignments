import java.util.HashSet;
import java.util.Scanner;

public class HashSetexample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        HashSet<String> hashSet=new HashSet<>();
        boolean continueloop=true;
        while (continueloop){
            System.out.println("enter string");
            String input=scanner.nextLine();
            hashSet.add(input);
            System.out.println("do you wish to cont> Y/N");
            continueloop=scanner.nextLine().equalsIgnoreCase("y");
        }
        hashSet.forEach(s -> System.out.println(s));
    }
}
