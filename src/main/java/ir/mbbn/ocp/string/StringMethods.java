package ir.mbbn.ocp.string;

public class StringMethods {

    public static void main(String[] args) {
        String s1 = """
                         \u2000\u2000\u2000this is test for remove whitespace      \t\n\r
                """;

        String s2 = """
                \u2000\u2000\u2000this is test for remove whitespace      \t\u2000
                \u2000\u2000\n\r\u2000
                """;

        System.out.println(s1.length());
        System.out.println(s1);
        System.out.println(s1.trim().length());
        System.out.println(s1.trim());
        System.out.println(s1.strip().length());
        System.out.println(s1.strip());

        System.out.println(s2.length());
        System.out.println(s2);
        System.out.println(s2.trim().length());
        System.out.println(s2.trim());
        System.out.println(s2.strip().length());
        System.out.println(s2.strip());

        System.out.println(" ".isEmpty()); // false
        System.out.println("".isEmpty()); // true
        System.out.println(" ".isBlank()); // true
        System.out.println("".isBlank()); // true

        var pi = 3.14159265359;
        var i = 314159265;
        System.out.println(String.format("[%s] [%15s]", pi, pi));
        System.out.println(String.format("[%d] [%015d]", i, i));
        System.out.println(String.format("[%f] [%015f]", pi, pi));
        System.out.println(String.format("[%f] %n[%015.3f]", pi, pi));
    }
}
