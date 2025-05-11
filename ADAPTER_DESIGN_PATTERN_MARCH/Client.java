package ADAPTER_DESIGN_PATTERN_MARCH;

import ADAPTER_DESIGN_PATTERN_MARCH.Adapter.BankInterface;
import ADAPTER_DESIGN_PATTERN_MARCH.Adapter.sbiAdapter;
import ADAPTER_DESIGN_PATTERN_MARCH.SimpleFactory.SelectBank;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Client {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Select Bank YesBank || SBI");
        String bank=sc.nextLine();
        BankInterface bankApi= SelectBank.selectBank(bank);

        System.out.println("Enter The Account that you want to send Money "+
                "|| From which account to transfer " +
                "|| Amount to transfer");
        String to=sc.nextLine();
        String from=sc.nextLine();
        int amt= sc.nextInt();
        bankApi.sendMoney(to, from, amt);


    }
}
