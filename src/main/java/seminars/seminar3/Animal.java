package seminars.seminar3;

public abstract class Animal {

    private static int idCounter = 1000;
    private static int counter;
    private int id;

    {
        id = idCounter++;
        counter++;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    private String name;
    private int maxRun;
    private int maxSwim;

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }

    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
    }

    public void run(int distance) {
        if (distance <= maxRun) {
            System.out.printf("%s пробежал %d метров\n", name, distance);
        } else
            System.out.printf("%s сошел с дистанции\n", name);
    }

    public void swim(int distance) {
        if (distance <= maxSwim) {
            System.out.printf("%s проплыл %d метров\n", name, distance);
        } else
            System.out.printf("%s сошел с дистанции\n", name);
    }
}
