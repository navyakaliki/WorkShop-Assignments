
import java.util.Scanner;
import java.util.ArrayList;

    public class ObjectsandLists {
        public static void main(String[] args) {
            ArrayList<Integer> intArray = new ArrayList<Integer>();
            ArrayList<String> strArray = new ArrayList<String>();
            ArrayList<Customer> custArray = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            do {
                System.out.println("what kind of object do you want to create?\n" +
                        "1- int\n" +
                        "2- String\n" +
                        "3- Cust\n" +
                        "Q- to Quit");

                String input = scanner.nextLine();

                if(input.equals("1")) {
                    System.out.println("enter the input");
                    int intInput = Integer.parseInt(scanner.nextLine());
                    intArray.add(intInput);

                }

                else if(input.equals("2")){
                    System.out.println("enter the input");
                    String arrinput = scanner.nextLine();
                    strArray.add(arrinput);
                }
                else if(input.equals("3")){
                    System.out.println("enter the First name");
                    String firstName = scanner.nextLine();
                    System.out.println("enter last name");
                    String lastName=scanner.nextLine();
                    Customer newCust=new Customer(firstName,lastName);
                    custArray.add(newCust);
                }

                else if(input.equals("Q")){
                    System.out.println("Integer list" + intArray);
                    System.out.println("string list" + strArray);
                    System.out.println("customer list" + custArray);
                    System.exit(0);
                }
            } while (true);

        }
    }

