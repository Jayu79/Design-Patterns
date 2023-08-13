import thirdParty.YesBank.YESBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter{

    private YESBankAPI yesBank = new YESBankAPI();

    public double getBalance(String AccountNumber){
        return 100;
    }

    public boolean sendMoney(String fromAccount,String toAccount,double Amount){
        return true;
    }
}
