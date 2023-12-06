package ir.mbbn.ocp.expression;

public class SwitchExpression {

    public static void main(String[] args) {
        int day = 3;
        var dayOfWeek = switch (day){
            case 0 -> "Sunday";
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "UnKnown";
        };
        System.out.println(dayOfWeek);
    }
}
