package AdapterPAttern;

import AdapterPAttern.BanksThirdParty.YesBank;

public class YesBankAdapter implements BankApi{
    private YesBank yesBank=new YesBank();;
    @Override
    public void SendMoney(String from, String to, int ammount) {
        yesBank.TransferMoney(ammount, from, to);
    }

    @Override
    public String CheckBalance(String Balance) {
        return "9999999999999";
    }
}
