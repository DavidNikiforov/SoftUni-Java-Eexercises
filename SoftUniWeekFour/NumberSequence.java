package SoftUniWeekFour;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (minNumber > num) {
                minNumber = num;
            }
            if (maxNumber < num) {
                maxNumber = num;
            }
        }
        System.out.printf("Max number: %d\n", maxNumber);
        System.out.printf("Min number: %d", minNumber);
    }
}
