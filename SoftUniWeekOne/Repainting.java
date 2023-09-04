package SoftUniWeekOne;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int naylon = Integer.parseInt(scanner.nextLine());
        int amountOfPaint = Integer.parseInt(scanner.nextLine());
        int amountOfThinner = Integer.parseInt(scanner.nextLine());
        int hoursOfWork = Integer.parseInt(scanner.nextLine());

        double naylonSum = (naylon + 2) * 1.50;
        double paintSum = (amountOfPaint + amountOfPaint * 0.10) * 14.50;
        double thinnerPrice = amountOfThinner * 5.00;
        double bags = 0.40;
        double sumOfMaterials = naylonSum + paintSum + thinnerPrice + bags;
        double sumForWorkers = (sumOfMaterials * 0.30) * hoursOfWork;

        double finalSum = sumOfMaterials + sumForWorkers;

        System.out.println(finalSum);

    }
}
