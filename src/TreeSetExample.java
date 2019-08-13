import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class TreeSetExample {
        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);
            TreeSet<EmployeeDetails> treeSet=new TreeSet<>();
            boolean continueloop=true;
            while (continueloop){
                System.out.println("enter First Name");
                String fName = scanner.nextLine();
                System.out.println("Enter Last name:");
                String lName = scanner.nextLine();
                System.out.println("Enter Salary");
                double salary = Double.parseDouble(scanner.nextLine());
                treeSet.add(new EmployeeDetails(fName, lName, salary));
                System.out.println("do you wish to cont> Y/N");
                continueloop=scanner.nextLine().equalsIgnoreCase("y");
            }
            treeSet.forEach(s -> System.out.println(s));
        }
    }

