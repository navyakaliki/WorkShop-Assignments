import java.util.Scanner;

public class ArithmeticExpression {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("First Number:");
        int n1 = Integer.parseInt(number.nextLine());
        System.out.println("increment value");
        int n2=Integer.parseInt(number.nextLine());

        for(int i=1;i<=20;i++){

            System.out.println(n1+" ");
            n1=n1+n2;

        }
    }
}