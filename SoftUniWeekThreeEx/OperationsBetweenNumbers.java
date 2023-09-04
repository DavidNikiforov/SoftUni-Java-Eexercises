package SoftUniWeekThreeEx;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1 = Double.parseDouble(scanner.nextLine());
        double num2 = Double.parseDouble(scanner.nextLine());
        double result = 0.0;
        String oddOrEven = "";

        char operator = scanner.next().charAt(0);


        switch (operator){
            case '+':
                result = num1 + num2;
                if (result % 2 == 0){
                    oddOrEven = "even";
                }else {
                    oddOrEven = "odd";
                }
                break;
            case '-':
                result = num1 - num2;
                if (result % 2 == 0){
                    oddOrEven = "even";
                }else {
                    oddOrEven = "odd";
                }
                break;
            case '*':
                result = num1 * num2;
                if (result % 2 == 0){
                    oddOrEven = "even";
                }else {
                    oddOrEven = "odd";
                }
                break;
            case '/':
                result = num1 / num2;
                if (num2 == 0){
                    System.out.printf("Cannot divide %.3s by zero", num1);
                }else {
                    result = num1 / num2;
                    System.out.printf("%.0f / %.0f = %.2f", num1, num2, result);
                }
                break;
            case '%':
                result = num1 % num2;
                if (num2 == 0){
                    System.out.printf("Cannot divide %.2s by zero", num1);
                }else {
                    result = num1 % num2;
                    System.out.printf("%.0f %s %.0f = %.1s", num1, operator, num2, result);
                }
                break;
        }
        if (operator == '+'){
            System.out.printf("%.0f %c %.0f = %.0f - %s", num1, operator, num2, result, oddOrEven);
        }
        if (operator == '-'){
            System.out.printf("%.0f %c %.0f = %.0f - %s", num1, operator, num2, result, oddOrEven);
        }
        if (operator == '*'){
            System.out.printf("%.0f %c %.0f = %.0f - %s", num1, operator, num2, result, oddOrEven);
        }

    }
}
