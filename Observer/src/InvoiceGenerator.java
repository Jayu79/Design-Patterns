public class InvoiceGenerator implements OrderPlacedSubscriber{

    public InvoiceGenerator(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderPlaced() {
        System.out.println("Generating Invoice");
    }
}
