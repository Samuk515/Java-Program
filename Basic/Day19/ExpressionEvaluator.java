package Day19;

public class ExpressionEvaluator {
    static void  evaluate(String expr){
        String[] parts = expr.split(" ");
        double a = Double.parseDouble(parts[0]);
        String op = parts[1];
        double b =  Double.parseDouble(parts[2]);
        double result;

        switch (op){
            case "+": result = a + b; break;
            case "-": result = a - b; break;
            case "*": result = a * b; break;
            case "/":
                if ( b == 0) { System.out.println("Error: Division by zero"); return;}
            default:
                System.out.println("Unknown operator: " + op); return;
        }

        System.out.println(expr + " = " + result);
    }
    public static void main(String[] args) {
        evaluate("15 + 23");
        evaluate("100 - 47");
        evaluate("6 * 8 ");
        evaluate("99 / 9");
        evaluate("10 / 0");
    }
}
