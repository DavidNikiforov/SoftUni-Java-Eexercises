package SoftUniWeekTwoEx;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double outfitPrice = Double.parseDouble(scanner.nextLine());

        double setSum = movieBudget * 0.10;

        if (extras > 150){
            outfitPrice = outfitPrice - (0.10 * outfitPrice);
        }

        double totalOutfitPrice = outfitPrice * extras;
        double totalMovieCost = setSum + totalOutfitPrice;
        double moneyLeft = movieBudget - totalMovieCost;

        if (totalMovieCost > movieBudget){
            System.out.printf("Not enough money!\nWingard needs %.2f leva more.", Math.abs(moneyLeft));
        }else {
            System.out.printf("Action!\nWingard starts filming with %.2f leva left.", Math.abs(moneyLeft));
        }
    }
}
