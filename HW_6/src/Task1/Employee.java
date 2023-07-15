package Task1;

import java.sql.Date;

public class Employee {
    private String name;
    private Date dob;
    private int baseSalary;

    public Employee(String name, Date dob, int baseSalary) {
        this.name = name;
        this.dob = dob;
        this.baseSalary = baseSalary;
    }

    public String getEmpInfo() {
        return "name - " + name + " , dob - " + dob.toString();
    }

    // добавил геттер, поле перносить не стал, потому что у разных работников могут быть разные ставки
    public int getBaseSalary() {
        return baseSalary;
    }
}
