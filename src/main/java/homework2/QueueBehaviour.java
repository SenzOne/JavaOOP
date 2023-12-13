package homework2;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders(Product product);
    void giveOrders(Product product);
    void releaseQueue();
}
