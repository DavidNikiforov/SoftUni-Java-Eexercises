package SoftUniWeekFourEx;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double priceWasher = Double.parseDouble(scanner.nextLine());
        int pricePerToy = Integer.parseInt(scanner.nextLine());

        int countToys = 0;
        double savedMoney = 0;
        double giftSum = 0;


        for (int birthdays = 1; birthdays <= age ; birthdays++) {
            if (birthdays % 2 == 0){
                giftSum += 10;
                savedMoney += giftSum - 1;
            }else {
                countToys++;
            }
        }
        double totalSum = (countToys * pricePerToy) + savedMoney;

        if (totalSum >= priceWasher){
            double moneyLeft = totalSum - priceWasher;
            System.out.printf("Yes! %.2f", moneyLeft);
        }else {
            double neededMoney = priceWasher - totalSum;
            System.out.printf("No! %.2f", neededMoney);
        }
    }
}
