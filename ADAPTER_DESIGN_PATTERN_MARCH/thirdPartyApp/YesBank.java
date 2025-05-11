package ADAPTER_DESIGN_PATTERN_MARCH.thirdPartyApp;

public class YesBank {
    public void SendMoney(String from,String to, int amt){
        System.out.println("Amount Transfered from "+from+" to "+to+" is "+amt);
    }
    public void checkBalance(){
        System.out.println("Your account balance is :"+99999999);
    }
}
