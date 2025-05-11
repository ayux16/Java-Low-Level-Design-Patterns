package ADAPTER_DESIGN_PATTERN_MARCH.SimpleFactory;

import ADAPTER_DESIGN_PATTERN_MARCH.Adapter.BankInterface;
import ADAPTER_DESIGN_PATTERN_MARCH.Adapter.YesBankAdapter;
import ADAPTER_DESIGN_PATTERN_MARCH.Adapter.sbiAdapter;
import ADAPTER_DESIGN_PATTERN_MARCH.thirdPartyApp.SBI;
import ADAPTER_DESIGN_PATTERN_MARCH.thirdPartyApp.YesBank;

public class SelectBank {
    public static BankInterface selectBank(String bankName){
        if(bankName.equalsIgnoreCase("SBI")){
            return new sbiAdapter();
        }
        else if(bankName.equalsIgnoreCase("YesBank")){
            return new YesBankAdapter();
        }
        else{
            return null;
        }
    }
}
