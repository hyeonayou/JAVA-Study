package chap_07;

import java.util.Random;

public class _11_Package {
    public static void main(String[] args) {
        // 패키지 (랜덤 클래스)
        Random random = new Random();
        System.out.println(random.nextInt(10)); // 0 이상 10 미만의 정수형 반환

    }
}
