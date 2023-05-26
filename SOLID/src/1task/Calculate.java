package Task_1;

public class Calculate {
    private int baseSalary;
    
    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);// calculate in otherway
        return baseSalary - tax;
    }
}
