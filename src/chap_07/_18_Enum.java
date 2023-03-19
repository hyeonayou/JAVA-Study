package chap_07;

public class _18_Enum {
    public static void main(String[] args) {
        // 열거형
        // 달력 : jan, feb, MAR
        // 옷 사이즈 : S,M,L,XL....

        Resolution resolution = Resolution.HD;
        System.out.println(resolution);
    }
}

enum Resolution {
    HD, FHD, UHD
}