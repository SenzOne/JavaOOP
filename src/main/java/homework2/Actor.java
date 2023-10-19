package homework2;

public abstract class Actor implements ActorBehavoir{
    protected final String name;
    protected boolean isMakeOrder;
    protected boolean isTakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract String getName();
}
