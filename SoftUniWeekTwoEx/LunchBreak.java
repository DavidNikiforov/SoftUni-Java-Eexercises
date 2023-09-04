package SoftUniWeekTwoEx;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String seriesName = scanner.nextLine();
        int episodeLength = Integer.parseInt(scanner.nextLine());
        int breakTime = Integer.parseInt(scanner.nextLine());

        double timeForLunch = breakTime * 0.125;
        double restTime = breakTime * 0.25;

        double totalTime = episodeLength + timeForLunch + restTime;
        double timeLeft = Math.abs(breakTime - totalTime);

        if (breakTime >= totalTime){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", seriesName, Math.abs(Math.ceil(timeLeft)));
        }else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", seriesName, Math.abs(Math.ceil(timeLeft)));
        }
    }
}
