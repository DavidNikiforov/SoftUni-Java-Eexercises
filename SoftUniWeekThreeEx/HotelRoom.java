package SoftUniWeekThreeEx;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double price = 0.0;
        double apartmentPrice = 0.0;
        double studioPrice = 0.0;

        if (month.equals("May") || month.equals("October")){
            studioPrice = 50;
            apartmentPrice = 65;
            if (days > 7 && days < 14){
                studioPrice = studioPrice - (studioPrice * 0.05);
            }
            if (days > 14){
                studioPrice = studioPrice - (studioPrice * 0.3);
                apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
            }
        }

        if (month.equals("June") || month.equals("September")){
            studioPrice = 75.20;
            apartmentPrice = 68.70;
            if (days > 14){
                studioPrice = studioPrice - (studioPrice * 0.2);
                apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
            }
        }

        if (month.equals("July") || month.equals("August")){
            studioPrice = 76;
            apartmentPrice = 77;
            if (days > 14){
                apartmentPrice = apartmentPrice - (apartmentPrice * 0.10);
            }
        }

        double apartmentOverallPrice = days * apartmentPrice;
        double studioOverallPrice = days * studioPrice;

        System.out.printf("Apartment: %.2f lv.\n", apartmentOverallPrice);
        System.out.printf("Studio: %.2f lv.", studioOverallPrice);

    }
}
