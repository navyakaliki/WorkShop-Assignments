import java.util.HashMap;
import java.util.Scanner;
public class NumbersusingHashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number between 10-20");
        int input=Integer.parseInt(scanner.nextLine());
        if(input<=20 && input>=10) {
            for (int i = 0; i <= input; i++)
            {
                hashMap.put(i,Integer.toBinaryString(i));
            }
            hashMap.forEach((s,t)->{
                System.out.printf("%d,%s\n",s,t);

            });
        }
            else {
            System.out.println("invalid");
                   }
     }
}