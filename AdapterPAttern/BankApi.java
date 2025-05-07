package AdapterPAttern;

public interface BankApi {
    void SendMoney(String from,String to,int ammount);
    String CheckBalance(String Balance);
}
