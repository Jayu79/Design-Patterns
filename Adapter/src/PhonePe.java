public class PhonePe {
    private BankAPIAdapter bankAPI;

    public PhonePe(BankAPIAdapter bankAPI){
        this.bankAPI = bankAPI;
    }

    double doSomething() throws InterruptedException{

        double currentBalance = bankAPI.getBalance("AccountNumber");
        Thread.sleep(20*25*60*1000);
        return currentBalance;

    }
}
