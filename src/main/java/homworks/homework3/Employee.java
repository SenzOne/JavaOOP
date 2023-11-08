package homworks.homework3;

public abstract class Employee {
    private String surName;
    private String name;
    protected double salary;

    public String getSurName() {
        return surName;
    }

    public String getName() {
        return name;
    }


    public abstract double calculateSalary();

    public Employee(String surName, String name, double salary) {
        this.surName = surName;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "surName='" + surName + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
