package homworks.homework2;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(){
        System.out.println("Cat " + name + " became full");
        satiety = true;
    }

}
