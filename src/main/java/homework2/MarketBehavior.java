package homework2;

import java.util.List;

public interface MarketBehavior {
    void acceptToMarket (Actor actor);
    void relaseFromMarket(List<Actor> actors);

    void update();
}
