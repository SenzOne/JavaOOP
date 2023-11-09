package homework4;

public class Animal {
    private static int idCounter;
    private static int id;
    private String name;

    {
        id = ++idCounter;
    }

    public Animal(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
