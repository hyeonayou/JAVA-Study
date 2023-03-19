package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {

        // 형변환 TypeCasting
        // 정수형에서 실수형으로
        // 실수형에서 정수형으로

        int score = 93;
        System.out.println(score);
        System.out.println((float) score);
        System.out.println((double) score);

        // float , double to int
        float score_f = 93.3f;
        double score_d = 98.8;

        System.out.println(score_f);
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        // 정수 + 실수 연산
        score = 93 + (int) 98.8;
        System.out.println(score);

        // 정수 + 실수형은 자동으로 실수형으로 변환된다.
        score_d = 93 + 98.8;
        System.out.println(score_d);

        // int -> long -> float -> double ( 자동 형변환 )

        // 데이터형이 작은 범위로 바뀌면 수동으로 형변환을 해줘야 함.

        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
    }
}
