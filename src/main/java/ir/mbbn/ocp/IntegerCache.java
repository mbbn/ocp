package ir.mbbn.ocp;

public class IntegerCache {

    public static void main(String[] args) {
        Integer n1 = 125;
        System.out.println("n1=" + n1.hashCode());
        Integer n2 = 125;
        System.out.println("n2=" + n2.hashCode());
        System.out.println("n1==n2 => "+(n1 == n2));

        n1 = 127;
        System.out.println("n1=" + n1.hashCode());
        n2 = 127;
        System.out.println("n2=" + n2.hashCode());
        System.out.println("n1==n2 => "+(n1 == n2));  // number of between -127 to 127 cached by IntegerCache

        n1 = 128;
        System.out.println("n1=" + n1.hashCode());
        n2 = 128;
        System.out.println("n2=" + n2.hashCode());
        System.out.println("n1==n2 => "+(n1 == n2));

    }
}
