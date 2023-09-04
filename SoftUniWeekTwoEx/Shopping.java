package SoftUniWeekTwoEx;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ramMemory = Integer.parseInt(scanner.nextLine());

        double videoCardPrice = videoCards * 250;
        double processorPrice = (videoCardPrice * 0.35) * processors;
        double ramMemoryPrice = (videoCardPrice * 0.10) * ramMemory;

        double overallPrice = videoCardPrice + processorPrice + ramMemoryPrice;

        if (videoCards > processors){
            overallPrice = overallPrice - (overallPrice * 0.15);
        }

        double moneyLeft = Math.abs(budget - overallPrice);

        if (overallPrice <= budget){
            System.out.printf("You have %.2f leva left!", moneyLeft);
        }else {
            System.out.printf("Not enough money! You need %.2f leva more!", moneyLeft);
        }
    }
}
