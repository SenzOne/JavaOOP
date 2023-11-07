package seminars.seminar3;

public class Program {
    public static void main(String[] args) {
        Animal[] animals = {
                new Cat("Barsik", 20, 0),
                new Cat("Mursik", 50, 0),
                new Cat("mi", 50, 0),
                new Dog("шарик", 50, 50),
                new Dog("Rex", 70, 90)
        };

        for (Animal a : animals) {
            System.out.printf("%s - %s\n", a.getName(), a.getId());
            a.run(15);
            a.swim(70);
        }
        System.out.println("всего было создано " + Animal.getCounter() + " животных");
        System.out.println("всего было создано " + Cat.getCounter() + " кота");
        System.out.println("всего было создано " + Dog.getCounter() + " собак");
    }
}
