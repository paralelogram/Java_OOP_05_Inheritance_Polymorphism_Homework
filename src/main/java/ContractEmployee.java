public class ContractEmployee extends Employee implements IPay{
    private static int federalTaxIdmember;
    private double fixedMonthlyPayment;

    @Override
    public void setSalary(double salary) {
        if (salary > 0) {
            super.setSalary(fixedMonthlyPayment);
        }
    }

    public ContractEmployee(String name, double fixedMonthlyPayment){
        super(name);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        federalTaxIdmember++;
    }

    public double calculatePay() {
        return getSalary();
    }

    @Override
    public String toString() {
        return "Employee`s name: " + getName() + ", employeed: " + employeeld + ", salary: " + getSalary() + ", id: " + federalTaxIdmember;
    }
}
