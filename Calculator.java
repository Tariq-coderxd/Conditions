import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            // take operator input
            System.out.print("Give operator = ");
            char op = in.next().trim().charAt(0);

            // Check if the user wants to exit
            if (op == 'x' || op == 'X') {
                break;
            }

            // Check for valid operators
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                // input two numbers
                System.out.print("Give two numbers = ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    } else {
                        System.out.println("Division by zero is not allowed.");
                        continue;
                    }
                } else if (op == '%') {
                    if (num2 != 0) {
                        ans = num1 % num2;
                    } else {
                        System.out.println("Modulo by zero is not allowed.");
                        continue;
                    }
                }
            } else {
                System.out.println("Invalid Operator");
            }

            System.out.println("Answer = " + ans);
        }
    }
}
