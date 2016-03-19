package JavaSyntax;

import java.util.Scanner;

public class Problem5_FromDecimalTo7base {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        String convertedNumber = Integer.toString(number, 7);
        System.out.print(convertedNumber);
    }
}
