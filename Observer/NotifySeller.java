package Observer;

public class NotifySeller  implements OnOrderPlacedSubscribers{
    NotifySeller(){
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }
    @Override
    public void orderPlaced() {
        System.out.println("Order Placed Successfully Notify Seller to prepare order");
    }
}
