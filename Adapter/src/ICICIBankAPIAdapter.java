import thirdParty.ICICIBank.ICICIBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter{

    private ICICIBankAPI iciciBank= new ICICIBankAPI();


    @Override
    public double getBalance(String AccountNuber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double Amount) {

        return false;
    }
}
