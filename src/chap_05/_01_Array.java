package chap_05;

public class _01_Array {
    public static void main(String[] args) {
        // 배열 : 같은 자료형의 값 여러 개를 저장하는 연속된 공간

        String[] coffees = new String[4];

        coffees[0] ="아메리카노";
        coffees[1] ="카푸치노";

        // 다른 방법
        //String[] coffee = new String[] {"아메리카노", "카페모카", "라떼"};
        String[] coffee2 = {"아메리카노", "카페모카", "라떼"};

        System.out.println("-------------------------");

        System.out.println(coffee2[0]+ " 하나");
        System.out.println(coffee2[1]+ " 하나");
        System.out.println(coffee2[2]+ " 하나");
        System.out.println("주세요.");
    }
}
