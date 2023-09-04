package SoftUniWeekOne;

import java.util.Scanner;

public class VacationBookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bookPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int overallTime = bookPages / pagesPerHour;
        int readingTime = overallTime / days;

        System.out.println(readingTime);

    }
}
