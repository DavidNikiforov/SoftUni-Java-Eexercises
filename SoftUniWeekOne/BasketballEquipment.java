package SoftUniWeekOne;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearlyFee = Integer.parseInt(scanner.nextLine());

        double shoes = yearlyFee * 0.60;
        double outfit = shoes * 0.80;
        double ball = outfit * 0.25;
        double accessories = ball * 0.20;

        double finalPrice = yearlyFee + shoes + outfit + ball + accessories;

        System.out.println(finalPrice);

    }
}
