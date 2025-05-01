public class BankFactory {
    public Bank getBank(String bankName) {
        if (bankName == "TPBank"){
            return new TPBank();
        }else if (bankName == "VietcomBank"){
            return new VietcomBank();
        }
        return  null;
    }

}
