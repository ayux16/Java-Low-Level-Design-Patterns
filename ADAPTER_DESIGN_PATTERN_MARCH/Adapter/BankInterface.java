package ADAPTER_DESIGN_PATTERN_MARCH.Adapter;

public interface BankInterface {
    abstract void sendMoney(String to,String from,int amt);
    abstract void checkBalance();
}
