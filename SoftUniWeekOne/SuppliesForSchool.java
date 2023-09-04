package SoftUniWeekOne;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int packOfPens = Integer.parseInt(scanner.nextLine());
        int packOfMarkers = Integer.parseInt(scanner.nextLine());
        int preparation = Integer.parseInt(scanner.nextLine());
        int discount = Integer.parseInt(scanner.nextLine());

        double penPrice = packOfPens * 5.80;
        double markerPrice = packOfMarkers * 7.20;
        double prepPrice = preparation * 1.20;

        double sum = penPrice + markerPrice + prepPrice;
        double discountedSum = sum - (sum * discount)/ 100;


        System.out.println(discountedSum);

    }
}
