public class AnalyticsSender implements OrderPlacedSubscriber, OrderCancelledSubscriber{

    public AnalyticsSender(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announceOrderCancelled() {
    }

    @Override
    public void announceOrderPlaced() {
        System.out.println("Updating Analytics");
    }
}
