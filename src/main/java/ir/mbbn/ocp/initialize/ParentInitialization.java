package ir.mbbn.ocp.initialize;

public abstract class ParentInitialization {

    protected String f1 = "initialize super field";

    {
        System.out.println("initialize super block!, " + f1);
    }

    static {
        System.out.println("initialize super static block!");
    }

    public ParentInitialization() {
        f1 = "change in super constructor!";
        System.out.println("call super construct! " + f1);
    }
}
