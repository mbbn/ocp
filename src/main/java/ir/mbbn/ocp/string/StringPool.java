package ir.mbbn.ocp.string;

public class StringPool {
    public static void main(String[] args) {
        String s1 = "pool1"; // added this value in string pool
        System.out.println("reference s1=" + s1.hashCode());
        String s2 = "pool1"; // check literal and reference s2 to string pool
        System.out.println("reference s2=" + s2.hashCode());
        System.out.println("s1==s2 => "+(s1 == s2));

        s2 = new String("pool1"); // pooling just work on autoboxing not on constructor
        System.out.println("s1==s2 => "+(s1 == s2));

        s2 = s2.intern(); // with method intern you can use string pool
        System.out.println("s1==s2 => "+(s1 == s2));
    }
}
