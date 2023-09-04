package SoftUniWeekThreeEx;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String rating = scanner.nextLine();

        double price = 0.0;
        double total = 0.0;

        switch (roomType) {
            case "room for one person":
                price = 18;
                total = price * (days - 1);
                break;
            case "apartment":
                price = 25;
                total = price * (days - 1);
                if (days < 10) {
                    total = total - (total * 0.30);
                } else if (days > 10 && days <= 15) {
                    total = total - (total * 0.35);
                } else {
                    total = total - (total * 0.50);
                }
                break;
            case "president apartment":
                price = 35;
                total = price * (days - 1);
                if (days < 10) {
                    total = total - (total * 0.10);
                } else if (days > 10 && days <= 15) {
                    total = total - (total * 0.15);
                } else {
                    total = total - (total * 0.20);
                }
                break;

        }
        if (rating.equals("positive")){
            total = total + (total * 0.25);
        } else if (rating.equals("negative")) {
            total = total - (total * 0.10);
        }
        System.out.printf("%.2f", total);
    }
}
