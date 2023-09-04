package SoftUniWeekTwoEx;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstTime = Integer.parseInt(scanner.nextLine());
        int secondTime = Integer.parseInt(scanner.nextLine());
        int thirdTime = Integer.parseInt(scanner.nextLine());

        int timeSum = firstTime + secondTime + thirdTime;

        int minutes = timeSum / 60;
        int seconds = timeSum % 60;

        if (seconds < 10){
            System.out.printf("%d:%02d", minutes, seconds);
        }else {
            System.out.printf("%d:%02d", minutes, seconds);
        }

    }
}
