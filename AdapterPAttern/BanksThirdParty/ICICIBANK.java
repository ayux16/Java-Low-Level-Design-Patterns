package AdapterPAttern.BanksThirdParty;

public class ICICIBANK {
    public void SendMoney(String to, String from, int amount) {
        System.out.println("Amount Transfered to "+to+" from "+from+" is "+amount);
    }
}
