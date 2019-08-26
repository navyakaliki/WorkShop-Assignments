import java.util.Scanner;
public class Assignment {
    public static void main(String[] s) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String fname = scanner.nextLine();
        System.out.println("Please enter your surname");
        String sname = scanner.nextLine();
        System.out.println("Please enter your annual salary");
        int salary = Integer.parseInt(scanner.nextLine());

        double base_salary;
        float extra_cents;
        float base_tax;

        if (salary<18000){
            System.out.println("Nill Tax");
        }
        else if (salary > 18201 && salary < 37000) {
            extra_cents = (float) 0.19;
            base_salary = 18200;
            System.out.println((salary-base_salary)*extra_cents);
        } else if (salary > 37001 && salary < 90000) {
            base_tax = 3572;
            extra_cents = (float) 0.325;
            base_salary = 37000;
            System.out.println (base_tax+((salary-base_salary)*extra_cents));
        } else if (salary > 90001 && salary < 180000) {
            base_tax = 20797;
            extra_cents = (float) 0.37;
            base_salary = 90000;
            System.out.println (base_tax+((salary-base_salary)*extra_cents));
        }



    }
}