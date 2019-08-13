import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        TreeMap<Integer,String> treeMap=new TreeMap<>();
        boolean continueloop=true;
        int key=100;
        while (continueloop){
            System.out.println("enter Name");
            //String input=scanner.nextLine();
            treeMap.put(key--,scanner.nextLine());
            System.out.println("do you wish to cont> Y/N");
            continueloop=scanner.nextLine().equalsIgnoreCase("y");
        }
        for(int mapKey:treeMap.keySet()){
            System.out.printf("%d-%s\n",mapKey,treeMap.get(mapKey));
        }
//        treeMap.forEach((hi,bye)->{
//            System.out.printf("%d-%s",hi,bye);
//        });
    }
}
