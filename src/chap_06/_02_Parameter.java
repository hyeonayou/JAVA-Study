package chap_06;

public class _02_Parameter {
    public static void power(int number){
        int result = number * number;
        System.out.println(number + "의 2승은" + result);
    }



    public static void main(String[] args) {
        power(2 );
    }
}
