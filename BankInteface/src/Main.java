public class Main {
    public static void main(String[] args)   {
        BankFactory bf = new BankFactory();
        System.out.println(bf.getBank("VietcomBank").getBankName());
        System.out.println(bf.getBank("TPBank").getBankName());

    }
}