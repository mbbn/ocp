package ir.mbbn.ocp.initialize;

public class OrderOfInitialization extends ParentInitialization {

    {
        System.out.println("initialize block!, " + f1);
    }

    static {
        System.out.println("initialize static block!");
    }

    public OrderOfInitialization() {
        f1 = "change name!";
        System.out.println("call construct! " + f1);
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
