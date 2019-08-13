
public class EmployeeDetails implements Comparable{
    String fName;
    String lName;
    double salary;
    String empCode;
    int totalEmployees=1;

    public EmployeeDetails(String fName, String lName,double salary) {
        this.fName = fName;
        this.lName = lName;
        this.salary = salary;
        this.empCode = String.format("E%04d",totalEmployees++);
    }

    @Override
    public String toString() {
        return "EmployeeDetails{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", salary=" + salary +
                ", empCode='" + empCode + '\'' +
                ", totalEmployees=" + totalEmployees +
                '}';
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }
    public String getlName() {
        return lName;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    public int compareTo(Object o){
        if(o instanceof EmployeeDetails){
            EmployeeDetails empToCompare=(EmployeeDetails)o;
            return this.getfName().compareTo(empToCompare.fName);
        }
        return -1;
    }
}
