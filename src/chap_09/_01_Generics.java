package chap_09;

public class _01_Generics {
    public static void main(String[] args) {
        // 제네릭스
        // int -> In
        Integer[] iArray = {1,2,3,4,5};
        Double[] dArray = { 1.0, 2.0, 3.0, 4.0, 5.0};
        String[] sArray = {"A","B","C","D","E"};

        printIntArray(iArray);
        printDoubleArray(dArray);
        printStringArray(sArray);

        printAnyArray(iArray);
    }

    private static <T> void printAnyArray(T[] array){
        for (T i: array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printStringArray(String[] sArray) {
    }

    private static void printDoubleArray(Double[] dArray) {
    }

    private static void printIntArray(Integer[] iArray) {
        for (int i: iArray) {
            System.out.print(i + " ");
        }
    }
}
