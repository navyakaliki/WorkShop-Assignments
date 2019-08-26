import java.time.LocalDate;


public class Friend implements Comparable{
    String name;
    LocalDate dob;
    double phoneNumber;

    public Friend(String name, LocalDate dob, double phoneNumber) {
        this.name = name;
        this.dob = dob;
        this.phoneNumber = phoneNumber;
    }

    public Friend(String name, String dob, String phoneNumber) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", dob=" + dob +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Friend dobToCompare= (Friend) o;
        return this.getDob().compareTo(dobToCompare.dob);
        //return 0;
    }
}
