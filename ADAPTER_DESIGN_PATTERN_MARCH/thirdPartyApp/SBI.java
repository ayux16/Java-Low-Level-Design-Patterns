package ADAPTER_DESIGN_PATTERN_MARCH.thirdPartyApp;

public class SBI {
    public void TransferMoney(int amount, String from, String to) {
        System.out.println("Amount Transfered from " + from + " to " + to + " is " + amount);
    }
    public void BalanceCheck(){
        System.out.println("Your account balance is :"+99999999);
    }
}
