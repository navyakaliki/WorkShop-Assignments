import java.util.HashMap;
import java.util.Scanner;

public class CarCollectionHashmap {
    public static void main(String[] args) {
        HashMap<Integer,Car> htCarCollection= new HashMap<Integer, Car>();
        Scanner scanner= new Scanner(System.in);
        String reply= "N";
        int i=0;

        do{
            System.out.println("Enter your car model");
            String model = scanner.nextLine();
            System.out.println("Enter your brand");
            String brand = scanner.nextLine();
            Car carnew = new Car(model, brand);
            htCarCollection.put(++i,carnew);
            System.out.println("do you want to add another car");
            reply= scanner.nextLine();

        }while (reply.equalsIgnoreCase("Y"));
        System.out.println("the collection");
        System.out.println(htCarCollection);
        for (int carNum: htCarCollection.keySet());
        System.out.println(htCarCollection);

    }

}
