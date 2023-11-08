package homworks.homework3;

public class Freelancer extends Employee{
    private int hours;
    private int days;
    public Freelancer(String surName, String name, double salary, int hours, int days) {
        super(surName, name, salary);
        this.hours = hours;
        this.days = days;
    }

    @Override
    public double calculateSalary() {
        return hours * days * salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s - фрилансер: %s", super.getName(), super.getSurName(), calculateSalary());
    }
}
