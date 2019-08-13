//import java.util.Scanner;
//import java.util.TreeMap;
//]public class TreeMapEmployee {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        TreeMap<EmployeeDetails,String> treeMap = new TreeMap<>();
//        boolean continueloop = true;
//        int key = 100;
//        while (continueloop) {
//            System.out.println("enter Name");
//            System.out.println("enter First Name");
//            String fName = scanner.nextLine();
//            System.out.println("Enter Last name:");
//            String lName = scanner.nextLine();
//            System.out.println("Enter Salary");
//            double salary = Double.parseDouble(scanner.nextLine());
//            treeMap.put(new EmployeeDetails(fName, lName, salary));
//            System.out.println("do you wish to cont> Y/N");
//
//            treeMap.put(key--, scanner.nextLine());
//            System.out.println("do you wish to cont> Y/N");
//            continueloop = scanner.nextLine().equalsIgnoreCase("y");
//        }
//        for (int treeMap : treeMap.keySet()) {
//            System.out.printf("%d-%s\n", treeMap, treeMap.get(treeMap));
//        }
//    }
//}