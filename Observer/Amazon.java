package Observer;

import java.util.ArrayList;
import java.util.List;

public class Amazon {
    public static Amazon instance = null;
    Amazon() {}
    public static Amazon getInstance() {
        if (instance == null) {
            instance = new Amazon();
        }
        return instance;
    }
    List<OnOrderPlacedSubscribers> onOrderPlaced=new ArrayList<>();
    void registerSubscriber(OnOrderPlacedSubscribers onOrderPlacedSubscribers){
        onOrderPlaced.add(onOrderPlacedSubscribers);
    }
    void unregisterSubscriber(OnOrderPlacedSubscribers onOrderPlacedSubscribers) {
        onOrderPlaced.remove(onOrderPlacedSubscribers);
    }
    void onOrderPlaced(){
        for(OnOrderPlacedSubscribers onOrderPlacedSubscribers:onOrderPlaced){
            onOrderPlacedSubscribers.orderPlaced();
        }
    }
}
