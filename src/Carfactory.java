import java.util.Scanner;

public class Carfactory {

    public static void main(String[] args) {

//            car1.model="F type";
//            car1.brand="audi";
//            car1.color="red";
//            car1.year=2017;
//            car1.engine="v8";
        Scanner scanner = new Scanner(System.in);
        Car[] carsArray = new Car[3];

        for ( Car carnew:carsArray) {


            //String reply = "n";
            //do {
            System.out.println("Enter your car model");
            String model = scanner.nextLine();
            System.out.println("Enter your brand");
            String brand = scanner.nextLine();
            System.out.println("Enter your color");
            String color= scanner.nextLine();
            System.out.println("year");
            String year= scanner.next();
            System.out.println("enter the engine");
            String engine= scanner.nextLine();

            carnew= new Car(model,brand);

//            String color = scanner.nextLine();
//            System.out.println("Enter your engine");
//            String engine = scanner.nextLine();
//            Car c1 = new Car();
//            c1.model = model;
//            c1.brand = brand;
//            c1.color = color;
//            c1.engine = engine;
//            System.out.println(c1);
//            System.out.println("Do you want to enter another customer details? ");
//
//            //  reply = scanner.nextLine();
//            //} while (reply.equalsIgnoreCase("Y"));
//            scanner.close();

//q
            System.out.println(carnew);
        }
        for(Car carnew:carsArray){
            System.out.println(carnew);

        }
    }


}
