import javax.naming.MalformedLinkException;
import java.util.Scanner;
import java.util.TreeMap;
public class TreeMapString {
    public static void main(String[] args) {
        TreeMap<String,char[]> treeMap=new TreeMap<>();
        Scanner scanner= new Scanner(System.in);
        System.out.println("do you wish to cont:y");
        String response= scanner.nextLine();
        do{
            System.out.println("Enter String");
            String input=scanner.nextLine();
            char[] chars= input.toCharArray();
            treeMap.put(input,chars);
            System.out.println("q to exit y to continue");
            response=scanner.nextLine();
        }while (response.equalsIgnoreCase("y"));
        treeMap.forEach((s,t)-> {
            System.out.print(s);
            for(char c:t){
                System.out.print(" "+c);
            }
            System.out.println();
        });
    }
}
