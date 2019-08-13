import com.sun.source.tree.Tree;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeValidationLastName
{ public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args)
    {
        TreeSet<EmployeeDetails> employeeList= new TreeSet<>();

        boolean loopforever=true;
       while(loopforever) {
           System.out.println("enter First Name");
           String fName = scanner.nextLine();
           System.out.println("Enter Last name:");
           String lName = scanner.nextLine();
           System.out.println("Enter Salary");
           double salary = Double.parseDouble(scanner.nextLine());
           employeeList.add(new EmployeeDetails(fName, lName, salary));
           System.out.println("Do you want to continue?");
           loopforever = scanner.nextLine().equalsIgnoreCase("Y");
       }

             while(true){
                 System.out.println("Press -1 for searching with lastname:");
                String choice=scanner.nextLine();
                switch (choice)
                {
                    case "1":
                        lastNameValidation(employeeList);
                        break;
                    default:
                        System.out.println("invalid");
                        System.exit(0);
                }

            }
        }
        public static void lastNameValidation(TreeSet<EmployeeDetails> employeeList) {
            System.out.println("Search for last name");
            String name=scanner.nextLine();

            List listOne = employeeList.stream().filter(emp -> {
                return emp.lName.contains(name);
            }).collect(Collectors.toList());
            listOne.forEach(emp -> {
                System.out.println(emp);
            });
        }

        }

