package ir.mbbn.ocp.operator;

public class Assignment {

    public static void main(String[] args) {
        short s = 32767; // can you assign number between -32768 to 32767
        System.out.println(" " + s + "->" + Integer.toBinaryString(s));
        s = (short) 32768; // bigger than 32767 will be cast equal 32767 + 1
        System.out.println(s + "->" + Integer.toBinaryString(s));
        s = (short) 32769; // bigger than 32767 will be cast equal 32767 + 2
        System.out.println(s + "->" + Integer.toBinaryString(s));
    }
}
