package chap_07;

public class _10_AccrssModifier {
    public static void main(String[] args) {
        // 접근 제어자
        // private : 해당 클래스 내에서만 접근 가능
        // public : 모든 클래스에서 접근 가능
        // default : (아무것도 적지않았을 때)  같은 패키지 내에서만 접근 가능 
        // protected : 같은 패키지 내에서, 다른 패키지인 경우 자식 클래스에서 접근 가능 
        BlackBoxRefurbish b1 = new BlackBoxRefurbish();
        b1.modelName = "까망이";
        System.out.println(b1.modelName);
        b1.setPrice(10000);
        System.out.println(b1.getPrice());
        BlackBoxRefurbish b2 = new BlackBoxRefurbish();
        b2.modelName = "하양이";
        System.out.println(b2.modelName);
    }
}
