package ir.mbbn.ocp;

public class OrderOfInitialization {

    private String f1 = "initialize field";

    {
        System.out.println("initialize block!, "+ f1);
    }

    static {
        System.out.println("initialize static block!");
    }

    public OrderOfInitialization() {
        f1 = "change name!";
        System.out.println("call construct!");
    }

    @Override
    public String toString() {
        return "OrderOfInitialization{" +
                "f1='" + f1 + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new OrderOfInitialization());
    }
}
