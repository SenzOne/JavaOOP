package homworks.homework3;

public class Worker extends Employee{
    public Worker(String surName, String name, double salary) {
        super(surName, name, salary);
    }

    @Override
    public double calculateSalary() {
        return getSalary();
    }

    @Override
    public String toString() {
        return String.format("%s %s - работник: %s", super.getName(), super.getSurName(), calculateSalary());
    }
}
