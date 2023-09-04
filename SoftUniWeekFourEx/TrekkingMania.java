package SoftUniWeekFourEx;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montblanc = 0;
        int kilimanjaro = 0;
        int k2 = 0;
        int everest = 0;

        for (int i = 0; i < groupCount; i++) {
            int alpinists = Integer.parseInt(scanner.nextLine());

            if (alpinists <= 5){
                musala += alpinists;
            } else if (alpinists >= 6 && alpinists <= 12) {
                montblanc += alpinists;
            } else if (alpinists >= 13 && alpinists <= 25) {
                kilimanjaro += alpinists;
            } else if (alpinists >= 26 && alpinists <= 40) {
                k2 += alpinists;
            }else if (alpinists >= 41){
                everest += alpinists;
            }
        }

        double totalAlpinist = musala + montblanc + kilimanjaro + k2 + everest;

        double percentMusala = musala / totalAlpinist * 100;
        double percentMontblanc = montblanc / totalAlpinist * 100;
        double percentKilimajaro = kilimanjaro / totalAlpinist * 100;
        double percentK2 = k2 / totalAlpinist * 100;
        double percentEverest = everest / totalAlpinist * 100;

        System.out.printf("%.2f%%%n", percentMusala);
        System.out.printf("%.2f%%%n", percentMontblanc);
        System.out.printf("%.2f%%%n", percentKilimajaro);
        System.out.printf("%.2f%%%n", percentK2);
        System.out.printf("%.2f%%%n", percentEverest);

    }
}
