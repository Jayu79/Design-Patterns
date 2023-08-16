public class Main {
    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();

        EmailSender email = new EmailSender();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        AnalyticsSender analyticsSender = new AnalyticsSender();

        flipkart.orderPlaced();

    }
}