package seminars.seminar3;

public class Cat extends Animal{

    private static int counter;
    public static int getCounter(){
        return counter;
    }

    {
        counter++;
    }
    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
    }

    @Override
    public void swim(int distance) {
        System.out.printf("%s, кот не умеет плавать\n", super.getName());
    }
}
