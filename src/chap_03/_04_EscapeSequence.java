package chap_03;

public class _04_EscapeSequence {
    public static void main(String[] args) {
        // 특수문자, 이스케이프 문자
        // \n \t \\ \" \'

        System.out.println("자바가");
        System.out.println("너무");
        System.out.println("재밌어요.");

        // \n -> 줄바꿈
        System.out.println("자바가\n너무\n재밌어요");

        //해물파전      9000원
        //김치전       8000원
        // \t -> tab 효과를 줄 수 있음.
        System.out.println("해물파전\t\t9000원");


        // \\ -> 역슬레시를 적고싶으면 \\ 두개를 써야 적용됨.
        System.out.println("C:\\Program Files \\Java");


        // 단비가 "냐옹" 이라고 했어요.
        // "\ -> 큰 따옴표
        System.out.println("단비가 \"냐옹\"이라고 했어요.");

        char c = 'A';
        c = '\'';
    }
}
