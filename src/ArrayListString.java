import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> stringArrayList = new ArrayList<>();
        List<String> filteredList = new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Do you wish to add a string-Y or exit -Q");
            String inputString=scanner.nextLine();
            if(inputString.equalsIgnoreCase("Y")) {
                System.out.println("enter string");
                String newInput = scanner.nextLine();
                stringArrayList.add(newInput);
            }
            else if(inputString.equalsIgnoreCase(""))
            {
                stringArrayList.add(null);
            }
            else if(inputString.equalsIgnoreCase("Q")){

                System.out.println(stringArrayList);

                    filteredList=stringArrayList.stream().filter(s->
                    {
                        return (s!=null);
                    }).collect(Collectors.toList());
                    System.out.println("Filtered List");
                    filteredList.forEach(s -> System.out.println(s));

            }
        }while (true);
    }
}
