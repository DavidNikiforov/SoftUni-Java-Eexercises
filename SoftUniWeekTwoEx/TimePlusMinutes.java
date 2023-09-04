package SoftUniWeekTwoEx;

import java.util.Scanner;

public class TimePlusMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int timeSum = hours * 60 + minutes + 15;

        hours = timeSum / 60;
        minutes = timeSum % 60;

        if (hours == 24){
            hours = 0;
        }

        System.out.printf("%d:%02d", hours, minutes);



    }
}
