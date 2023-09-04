package SoftUniWeekOne;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfAquarium = Integer.parseInt(scanner.nextLine());
        int widthOfAquarium = Integer.parseInt(scanner.nextLine());
        int heightOfAquarium = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = lengthOfAquarium * widthOfAquarium * heightOfAquarium;
        double volumeInLiters = volume / 1000;
        double occupied = percent / 100;
        double requiredLiters = volumeInLiters * (1 - occupied);

        System.out.println(requiredLiters);
    }
}
