package SoftUniWeekTwoEx;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());

        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int toyTrucks = Integer.parseInt(scanner.nextLine());

        double puzzlePrice = 2.60;
        double dollPrice = 3;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double toyTruckPrice = 2;

        double price = (puzzlePrice * puzzles) + (dollPrice * dolls) + (teddyBearPrice * teddyBears) + (minionPrice * minions) + (toyTruckPrice * toyTrucks);
        double toyAmount = puzzles + dolls + teddyBears + minions + toyTrucks;

        if (toyAmount >= 50){
            price = price - (price * 0.25);
        }

        price = price - (price * 0.1);

        if (price >= tripPrice){
            double enoughMoney = price - tripPrice;
            System.out.printf("Yes! %.2f lv left.", enoughMoney);
        }else {
            double moneyNeeded = tripPrice - price;
            System.out.printf("Not enough money! %.2f lv needed.", moneyNeeded);
        }
    }
}
