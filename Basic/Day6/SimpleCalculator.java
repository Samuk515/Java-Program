package Day6;

public class SimpleCalculator {
    public static void main(String[] args) {
        double num1 = 15, num2 = 4;
        char op = '/';

        switch (op) {
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error: Division by zero!");
                } else {
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Invalid operator: " + op);
        }
    }
}