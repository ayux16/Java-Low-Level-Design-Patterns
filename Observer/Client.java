package Observer;

public class Client {
    public static void main(String[] args) {
        Amazon amazon = Amazon.getInstance();
        DeliveryService deliveryService = new DeliveryService();
        InventoryService inventoryService = new InventoryService();
        GenerateInvoice invoiceGenerator = new GenerateInvoice();
        NotifySeller notifySeller = new NotifySeller();
        amazon.onOrderPlaced();
    }
}
