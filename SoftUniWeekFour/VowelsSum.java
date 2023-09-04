package SoftUniWeekFour;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String s = scanner.nextLine().toLowerCase();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char word = s.charAt(i);

            if (word == 'a') {
                sum = sum + 1;
            }
            if (word == 'e') {
                sum = sum + 2;
            }
            if (word == 'i') {
                sum = sum + 3;
            }
            if (word == 'o') {
                sum = sum + 4;
            }
            if (word == 'u') {
                sum = sum + 5;
            }
        }
        System.out.println(sum);

    }
}
