import java.util.Scanner;

public class MemberRepo {
    String name;
    int code;
    float salary;

    public static void main(String[] args) {

        MemberRepo details = new MemberRepo();

        details.name = "Lav";
        details.code = 100;
        details.salary = (float) 12345.60;
    }

    public String toString() {
        return name + code + salary;

    }
}