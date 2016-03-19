package IntroJava;

import java.util.Locale;
import java.util.Scanner;

public class Problem8_GetAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        findAverage(a,b,c);
    }

    private static void findAverage(double a, double b, double c) {
        double ave = (a + b + c)/3;
        System.out.printf("%.2f",ave);
    }
}
