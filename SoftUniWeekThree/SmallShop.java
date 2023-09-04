package SoftUniWeekThree;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (town){
            case "Sofia":
                if (product.equals("coffee")){
                    price = 0.50;
                    System.out.println(amount * price);
                } else if (product.equals("water")) {
                    price = 0.80;
                    System.out.println(amount * price);
                }else if (product.equals("beer")) {
                    price = 1.20;
                    System.out.println(amount * price);
                }else if (product.equals("sweets")) {
                    price = 1.45;
                    System.out.println(amount * price);
                }else if (product.equals("peanuts")) {
                    price = 1.60;
                    System.out.println(amount * price);
                }
                break;

            case "Plovdiv":
                if (product.equals("coffee")){
                    price = 0.40;
                    System.out.println(amount * price);
                } else if (product.equals("water")) {
                    price = 0.70;
                    System.out.println(amount * price);
                }else if (product.equals("beer")) {
                    price = 1.15;
                    System.out.println(amount * price);
                }else if (product.equals("sweets")) {
                    price = 1.30;
                    System.out.println(amount * price);
                }else if (product.equals("peanuts")) {
                    price = 1.50;
                    System.out.println(amount * price);
                }
                break;
            case "Varna":
                if (product.equals("coffee")){
                    price = 0.45;
                    System.out.println(amount * price);
                } else if (product.equals("water")) {
                    price = 0.70;
                    System.out.println(amount * price);
                }else if (product.equals("beer")) {
                    price = 1.10;
                    System.out.println(amount * price);
                }else if (product.equals("sweets")) {
                    price = 1.35;
                    System.out.println(amount * price);
                }else if (product.equals("peanuts")) {
                    price = 1.55;
                    System.out.println(amount * price);
                }
                break;
        }

    }
}
