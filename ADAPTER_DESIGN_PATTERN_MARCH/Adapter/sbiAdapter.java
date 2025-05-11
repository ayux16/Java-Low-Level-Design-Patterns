package ADAPTER_DESIGN_PATTERN_MARCH.Adapter;

import ADAPTER_DESIGN_PATTERN_MARCH.thirdPartyApp.SBI;
import AdapterPAttern.BanksThirdParty.ICICIBANK;

public class sbiAdapter implements BankInterface{
    private SBI sbi=new SBI();
    @Override
    public void sendMoney(String to, String from, int amt) {
        sbi.TransferMoney(amt,from,to);
    }

    @Override
    public void checkBalance() {
        sbi.BalanceCheck();
    }
}

