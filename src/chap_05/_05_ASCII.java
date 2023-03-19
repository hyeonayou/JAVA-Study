package chap_05;

public class _05_ASCII {
    public static void main(String[] args) {
        char a = 'A';
        System.out.println(a);
        System.out.println((int) a);


        String[][] seats3 = new String[10][15];
        char c = 'A';
        for (int i = 0; i < seats3.length; i++) {
            for (int j = 0; j < seats3[i].length; j++) {
                seats3[i][j] = String.valueOf(c) + (j+1);
            }
            c++;
        }
        for (int s = 0; s < seats3.length; s++) {
            for (int i = 0; i < seats3[s].length; i++) {
                System.out.print(seats3[s][i] + " ");
            }
            System.out.println();

        }
    }
}