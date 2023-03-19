package chap_06;

public class _03_Return {
    public static String getPhoneNumber() {
        String phoneNumber = "02 -1234-4556";
        return phoneNumber;
    }


    public static void main(String[] args) {
       String phoneNumber1 = getPhoneNumber();
        System.out.println(phoneNumber1);
    }
}
