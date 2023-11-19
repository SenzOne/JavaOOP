package homework5.model;

public abstract class User {
    private static int id;
    private String name;
    private String surname;
    private static int counter = 1;


    {
        id = counter;
        counter++;
    }
    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public static int getId() {
        return id;
    }
}
