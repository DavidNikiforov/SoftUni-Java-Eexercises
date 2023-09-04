package SoftUniWeekOne;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenOrder = Integer.parseInt(scanner.nextLine());
        int fishOrder = Integer.parseInt(scanner.nextLine());
        int veganOrder = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenOrder * 10.35;
        double fishPrice = fishOrder * 12.40;
        double veganPrice = veganOrder * 8.15;
        double overallPrice = chickenPrice + fishPrice + veganPrice;
        double desertPrice = overallPrice * 0.20;
        double delivery = 2.50;

        double check = overallPrice + desertPrice + delivery;

        System.out.println(check);
    }
}
