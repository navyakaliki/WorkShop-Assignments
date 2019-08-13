public class Customer {
    String fName;
    String lName;

    public Customer(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;

    }

    @Override
    public String toString() {
        return "Customer{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                '}';
    }
}

