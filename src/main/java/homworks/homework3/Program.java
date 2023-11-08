package homworks.homework3;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        CreateEmployee createEmployee = new CreateEmployee(15);
        // ArrayList<Employee> employees = createEmployee.getEmployees();
        createEmployee.printEmployee();
    }
}
