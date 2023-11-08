package homworks.homework3;

import java.util.ArrayList;
import java.util.Random;

public class CreateEmployee {
    private static Random random = new Random();

    private String[] names = new String[]
            {"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
    private String[] surNames = new String[]
            {"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};



    private ArrayList<Employee> employees = new ArrayList<>();

    private int count;

    private Employee create() {
        int salaryIndex = random.nextInt(300, 500);
        int daysIndex = random.nextInt(1, 20);
        int hoursIndex = random.nextInt(1, 6);
        int typeIndex = random.nextInt(10);
        if (typeIndex >= 5){
            return new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salaryIndex * 120);
        } else {
            return new Freelancer(surNames[random.nextInt(surNames.length)],
                    names[random.nextInt(names.length)],
                    salaryIndex, hoursIndex, daysIndex );
        }

    }

    public CreateEmployee(int count) {
        this.count = count;

        for (int i = 0; i < count; i++) {
            employees.add(create());
        }
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void printEmployee(){
        for (Employee e: employees) {
            System.out.println(e);
        }
    }
}
