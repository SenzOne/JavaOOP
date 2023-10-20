package homework2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehavior, QueueBehaviour {
    private final List<Actor> queue;
    Product product;

    public Market(Product product) {
        this.queue = new ArrayList<>();
        this.product = product;
    }

    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor.getName() + " зашел в магазин");
        takeInQueue(actor);
    }

    @Override
    public void releaseFromMarket(List<Actor> actors) {
        for (Actor actor: actors){
            queue.remove(actor);
            System.out.println(actor.getName() + " вышел из магазина");
        }
    }

    @Override
    public void update() {
        takeOrders(product);
        giveOrders(product);
        releaseQueue();
    }

    @Override
    public void takeInQueue(Actor actor) {
        System.out.println(actor.getName() + " встал в очередь");
        queue.add(actor);
    }

    @Override
    public void takeOrders(Product product) {
        for (Actor actor : queue) {
            if (!actor.isMakeOrder) {
                actor.setMakeOrder(true);
                System.out.println(actor.getName() + " сделал заказ " + product.getName());
            }
        }
    }

    @Override
    public void giveOrders(Product product) {
        for (Actor actor : queue) {
            if (actor.isMakeOrder) {
                if (product.count > 1){
                    product.count -= 1;
                    System.out.println(actor.getName() + " получил заказ " + product.getName());
                } else {
                    System.out.println("Товаров " + product.getName()+ " больше нет");
                }
                actor.setTakeOrder(true);
            }
        }
    }

    @Override
    public void releaseQueue() {
        List<Actor> actorList = new ArrayList<>();
        for (Actor actor : queue) {
            if (actor.isTakeOrder()) {
                actorList.add(actor);
                System.out.println(actor.getName() + " вышел из очереди");
            }
        }
        releaseFromMarket(actorList);
    }
}
