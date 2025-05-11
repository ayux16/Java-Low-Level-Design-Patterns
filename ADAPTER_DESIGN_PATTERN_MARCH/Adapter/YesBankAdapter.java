package ADAPTER_DESIGN_PATTERN_MARCH.Adapter;


import ADAPTER_DESIGN_PATTERN_MARCH.thirdPartyApp.YesBank;
import AdapterPAttern.BanksThirdParty.ICICIBANK;

public class YesBankAdapter implements BankInterface{

    private YesBank yesBank=new YesBank();
    @Override
    public void sendMoney(String to, String from, int amt) {
        yesBank.SendMoney(from, to, amt);
    }

    @Override
    public void checkBalance() {
        yesBank.checkBalance();
    }
}
