public class Employee extends Person {
    private  int employeeId;
    private  double salary;

    public Employee(String name, String address, int employeeId, double salary) {
        super(name, address);
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", salary=" + salary +
                '}';
    }
}
