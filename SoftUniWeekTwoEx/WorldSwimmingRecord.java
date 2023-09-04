package SoftUniWeekTwoEx;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double secPerMinute = Double.parseDouble(scanner.nextLine());

        double ivanTime = distance * secPerMinute;

        double resistance = Math.floor(distance / 15) * 12.5;
        ivanTime = ivanTime + resistance;

        if (ivanTime < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", Math.abs(ivanTime));
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(worldRecord - ivanTime));
        }
    }
}
