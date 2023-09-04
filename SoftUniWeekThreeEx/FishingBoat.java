package SoftUniWeekThreeEx;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        int rentSpring = 3000;
        int rentSummer = 4200;
        int rentAutumn = 4200;
        int rentWinter = 2600;

        double price = 0.0;

        switch (season) {
            case "Spring":
                if (fishermen <= 6) {
                    price = rentSpring - (rentSpring * 0.10);
                } else if (fishermen > 7 && fishermen <= 11) {
                    price = rentSpring - (rentSpring * 0.15);
                } else if (fishermen >= 12) {
                    price = rentSpring - (rentSpring * 0.25);
                }
                break;
            case "Summer":
                if (fishermen <= 6) {
                    price = rentSummer - (rentSummer * 0.10);
                } else if (fishermen > 7 && fishermen <= 11) {
                    price = rentSummer - (rentSummer * 0.15);
                } else if (fishermen >= 12) {
                    price = rentSummer - (rentSummer * 0.25);
                }
                break;
            case "Autumn":
                if (fishermen <= 6) {
                    price = rentAutumn - (rentAutumn * 0.10);
                } else if (fishermen > 7 && fishermen <= 11) {
                    price = rentAutumn - (rentAutumn * 0.15);
                } else if (fishermen >= 12) {
                    price = rentAutumn - (rentAutumn * 0.25);
                }
                break;
            case "Winter":
                if (fishermen <= 6) {
                    price = rentWinter - (rentWinter * 0.10);
                } else if (fishermen > 7 && fishermen <= 11) {
                    price = rentWinter - (rentWinter * 0.15);
                } else if (fishermen >= 12) {
                    price = rentWinter - (rentWinter * 0.25);
                }
                break;
        }

        double discount = 0.0;

        if (fishermen % 2 == 0 && !season.equals("Autumn")) {
            price = price - (price * 0.05);
        }

        if (budget >= price) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else if (budget <= price) {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }


    }
}
