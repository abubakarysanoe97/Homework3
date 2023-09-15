package chapter9;

public class Employee extends Person {

    private String employeeId;
    private String title;
    public Employee(){
        super("angie");
        System.out.println("In Employee default constructor");

    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmpolyeeId(String empolyeeId) {
        this.employeeId = empolyeeId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
