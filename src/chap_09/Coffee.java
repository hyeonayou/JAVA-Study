package chap_09;

public class Coffee <T> {

    public T name;

    public Coffee(T name) {
        this.name = name;
    }

    public void ready() {
        System.out.println("커피 준비 완료" + name);
    }

    public static void main(String[] args) {
        Coffee<Integer> c1 = new Coffee<>(35);
        c1.ready();

        Coffee<String> c2 = new Coffee<>("조세호");
    }
}
