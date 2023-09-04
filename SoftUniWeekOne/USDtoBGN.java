package SoftUniWeekOne;

import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       double BGN = Double.parseDouble(scanner.nextLine());

       double USD = BGN * 1.79549;

        System.out.println(USD);

    }
}
