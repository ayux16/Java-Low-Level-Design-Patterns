package AdapterPAttern.BanksThirdParty;

public class YesBank {
    public void TransferMoney(int amount, String from, String to) {
        System.out.println("Amount Transfered from "+from+" to "+to+" is "+amount);
    }
}
