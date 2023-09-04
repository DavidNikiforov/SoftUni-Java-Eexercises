package SoftUniWeekFourEx;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double awardedPoints = Double.parseDouble(scanner.nextLine());
        int juryAmount = Integer.parseInt(scanner.nextLine());

        for (int jury = 0; jury < juryAmount; jury++) {
            String juryName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());

            double givenPoints = (juryName.length() * points) / 2;

            awardedPoints += givenPoints;

            if (awardedPoints >= 1250.5){
                break;
            }

        }

        if (awardedPoints >= 1250.5){
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, awardedPoints);
        }else {
            System.out.printf("Sorry, %s you need %.1f more!", actorName, 1250.5 - awardedPoints);
        }

    }
}
