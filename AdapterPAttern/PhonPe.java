package AdapterPAttern;

public class PhonPe {
    public static void main(String[] args) {
        BankApi bankApi=new YesBankAdapter();
        bankApi.SendMoney("Ayush","XYZ",100);
    }



}

