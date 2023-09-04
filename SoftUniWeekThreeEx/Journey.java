package SoftUniWeekThreeEx;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double price = 0.0;
        String destination = "";
        String place = "";

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                price = budget * 0.3;
                place = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.7;
                place = "Hotel";
            }
        }

        if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                price = budget * 0.4;
                place = "Camp";
            } else if (season.equals("winter")) {
                price = budget * 0.8;
                place = "Hotel";
            }
        }

        if (budget > 1000) {
            destination = "Europe";
            price = budget * 0.9;
            place = "Hotel";
        }

        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f ", place, price);
    }
}
