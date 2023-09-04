package SoftUniWeekThreeEx;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerAmount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0.0;

        switch (flowerType) {
            case "Roses":
                price = flowerAmount * 5.00;
                if (flowerAmount > 80) {
                    price = price - (price * 0.10);
                }
                break;
            case "Dahlias":
                price = flowerAmount * 3.80;
                if (flowerAmount > 90) {
                    price = price - (price * 0.15);
                }
                break;
            case "Tulips":
                price = flowerAmount * 2.80;
                if (flowerAmount > 80) {
                    price = price - (price * 0.15);
                }
                break;
            case "Narcissus":
                price = flowerAmount * 3.00;
                if (flowerAmount < 120) {
                    price = price + (price * 0.15);
                }
                break;
            case "Gladiolus":
                price = flowerAmount * 2.50;
                if (flowerAmount < 80) {
                    price = price + (price * 0.20);
                }
                break;
        }

        double moneyLeft = Math.abs(price - budget);

        if (price <= budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerAmount, flowerType, moneyLeft);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", moneyLeft);
        }
    }
}
