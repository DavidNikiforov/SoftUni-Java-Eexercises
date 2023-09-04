package SoftUniWeekOne;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        int month = Integer.parseInt(scanner.nextLine());
        double yearlyPercent = Double.parseDouble(scanner.nextLine());

        double interest = (deposit * yearlyPercent) / 100;
        double oneMonthInterest = interest  / 12;
        double sum = deposit + (month * oneMonthInterest);

        System.out.println(sum);

    }
}
