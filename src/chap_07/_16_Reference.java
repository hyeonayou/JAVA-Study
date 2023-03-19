package chap_07;

public class _16_Reference {
    public static void main(String[] args) {
        // 참조
        // 기본 자료형 -> 메소드를 가질 수 없음
        int[] i = new int[3];
        System.out.println(i[0]);

        double[] d = new double[3];
        System.out.println(d[0]);

        // 참조 자료형 : String, BlackBox ... 등등
        // 메소드를 가질 수 있음
        String[] s = new String[3];
        System.out.println(s[0]);

        BlackBox[] c = new BlackBox[3];
        System.out.println(c[0] == null);

    }
}
