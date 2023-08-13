public interface BankAPIAdapter {
    double getBalance(String AccountNuber);
    boolean sendMoney(String fromAccount, String toAccount, double Amount);
}
