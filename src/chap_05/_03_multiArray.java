package chap_05;

public class _03_multiArray {
    public static void main(String[] args) {
        // 다차원 배열 (2차원 배열)

        // 소규모 영화관 좌석

        String[][] seats = new String[][] {
                { "A1", "A2", "A3", "A4"},
                { "B1", "B2", "B3", "B4"},
                { "C1", "C2", "C3", "C4"}
        };

        // B2 에 접근하려면?
        System.out.println(seats[1][1]);


        // 첫 줄에는 3칸, 둘째 줄에는 4칸, 셋쨔 줄에는 5칸
        String[][] seats2 = {
                {"A1", "A2", "A3"},
                {"B1", "B2", "B3", "B4"},
                {"C1", "C2", "C3", "C4", "C5"}

        };
    }
}
