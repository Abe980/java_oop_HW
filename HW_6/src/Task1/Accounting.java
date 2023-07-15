package Task1;

public class Accounting {

    public int calculateNetSalary(Employee emp) {
        int tax = (int) (emp.getBaseSalary() * 0.25);//calculate in otherway
        return emp.getBaseSalary() - tax;
        }
    
}
