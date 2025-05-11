package Observer;

public class InventoryService implements OnOrderPlacedSubscribers{
    InventoryService(){
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }
    @Override
    public void orderPlaced() {
        System.out.println("Order Placed Setting up Inventory");
    }
}
