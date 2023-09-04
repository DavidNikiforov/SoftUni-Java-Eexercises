package SoftUniWeekOne;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = Math.PI;
        double radians = Double.parseDouble(scanner.nextLine());
        double degrees;

        degrees = radians * 180 / pi;

        System.out.println(degrees);


    }
}
