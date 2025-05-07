package AdapterPAttern;

import AdapterPAttern.BanksThirdParty.ICICIBANK;

public class ICICIBankAdapter implements BankApi{
    private ICICIBANK icicibank=new ICICIBANK();
    @Override
    public void SendMoney(String from, String to, int ammount) {
        icicibank.SendMoney(to, from, ammount);
    }

    @Override
    public String CheckBalance(String Balance) {
        return "";
    }
}
