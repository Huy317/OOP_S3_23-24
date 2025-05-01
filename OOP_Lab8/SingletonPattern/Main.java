package SingletonPattern;

public class Main {
    public static void main(String[] args) {
        CompanyInfo companyInfo = CompanyInfo.getInstance();
        companyInfo.displayInfo();

        companyInfo.setCompanyName("EIU-Đại học quốc tế miền đông");
        companyInfo.setAddress("Nam Kỳ Khởi Nghĩa, Định Hoà, Thủ Dầu Một, Bình Dương");
        companyInfo.setPhoneNumber("(+84) 0274 222 0372");
        companyInfo.displayInfo();
    }
    
}