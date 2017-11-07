interface IPay {
    public double calculatePay ();
}
public class Employee implements IPay{
    protected String employeeld;
    private String name;
    private double rate;
    private int hours;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double calculatePay() {
        salary = hours * rate;
        return salary;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeld() {
        return employeeld;
    }

    private static int totalHours;

    public static int getTotalHours() {
        return totalHours;
    }

    public Employee() {}

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, double rate){
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, double rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalHours += hours;
    }

    public double getRate() {
        return rate;
    }

    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    public String toString(){
        return "Employee`s name: " + name + ", employeed: " + employeeld + ", rate: " + rate + ", hours: " + hours + ", salary: " + getSalary();
    }



    public void changeRate(double rate){
        this.rate = rate;
    }


}