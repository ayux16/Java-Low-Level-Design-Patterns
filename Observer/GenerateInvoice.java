package Observer;

public class GenerateInvoice implements OnOrderPlacedSubscribers{
    GenerateInvoice(){
        Amazon amazon = Amazon.getInstance();
        amazon.registerSubscriber(this);
    }
    @Override
    public void orderPlaced() {
        System.out.println("Order Placed Generating Invoice.");
    }
}
