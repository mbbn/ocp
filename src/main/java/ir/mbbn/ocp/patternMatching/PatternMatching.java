package ir.mbbn.ocp.patternMatching;

public class PatternMatching {

    public static void main(String[] args) {
        Number n1 = 246;
        if (n1 instanceof Integer i) {
            System.out.println("n1=" + n1.getClass());
            System.out.println("i=" + i.getClass());
        }
    }
}
