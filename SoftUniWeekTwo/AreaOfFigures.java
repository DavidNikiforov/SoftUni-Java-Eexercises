package SoftUniWeekTwo;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure = scanner.nextLine();
        double parameter = Double.parseDouble(scanner.nextLine());


        if (figure.equals("square")){
            System.out.printf("%.3f", parameter * parameter);
        }

        if (figure.equals("rectangle")){
            double parameterTwo = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", parameter * parameterTwo);
        }

        if (figure.equals("circle")){
            double Pi = Math.PI;
            System.out.printf("%.3f", Pi * Math.pow(parameter, 2));
        }

        if (figure.equals("triangle")){
            double parameterTwo = Double.parseDouble(scanner.nextLine());
            double area = (parameter * parameterTwo) / 2.0;
            System.out.printf("%.3f", area);
        }
    }
}
