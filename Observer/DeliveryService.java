package Observer;

public class DeliveryService implements OnOrderPlacedSubscribers{
    DeliveryService(){
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }
    @Override
    public void orderPlaced() {
    System.out.println("Order Placed Delivery Service started");
    }
}
