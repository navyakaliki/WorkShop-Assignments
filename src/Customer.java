public class Customer {
    String firstname;
    String lastname;
    String email;




 //   public Customer() {
   //     System.out.println("customer details are being collected");
   // }

    public Customer(String firstname, String lastname, String email, int age, double salary) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

    int age;
    double salary;

    public static class InputTest {
    }
}
