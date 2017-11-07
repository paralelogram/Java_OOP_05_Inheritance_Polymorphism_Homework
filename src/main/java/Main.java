public class Main {

    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new ContractEmployee("Petro", 5000);
        employees[0].setEmployeeld("cleaner");
        employees[1] = new SalariedEmployee("Roman", 1.5, 8, "999-009");
        employees[1].setEmployeeld("designer");
        for (int i = 1; i < employees.length; ++i) {
            for (int j = 0; j < employees.length - i; j++) {
                if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                    double temp = employees[j].getSalary();
                    employees[j].setSalary(employees[j + 1].getSalary());
                    employees[j + 1].setSalary(temp);
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());
        }
    }
}

