package SoftUniWeekThreeEx;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int all = rows * columns;
        double income = 0.0;

        switch (type){
            case "Premiere":
                income = all * 12;
                break;
            case "Normal":
                income = all * 7.5;
                break;
            case "Discount":
                income = all * 5.0;
                break;
        }
        System.out.printf("%.2f", income);

    }
}
