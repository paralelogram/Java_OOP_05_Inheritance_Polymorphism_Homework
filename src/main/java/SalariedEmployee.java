public class SalariedEmployee extends Employee implements IPay{
    private String socialSecurityNumber;

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public SalariedEmployee(String name, double rate, int hours, String socialSecurityNumber) {
        super(name, rate, hours);
        this.socialSecurityNumber = socialSecurityNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", social security number " + getSocialSecurityNumber();
    }
}
