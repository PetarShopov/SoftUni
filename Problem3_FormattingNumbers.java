package JavaSyntax;

import java.util.Scanner;

public class Problem3_FormattingNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = console.nextInt();
        String firstHexadecimalNumber = Integer.toHexString(firstNumber).toUpperCase();
        String firstBinaryNumber =  Integer.toBinaryString(firstNumber);;
        double secondNumber = console.nextDouble();
        double thirdNumber = console.nextDouble();
        System.out.printf("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f| ",
                firstHexadecimalNumber,
                Integer.parseInt(firstBinaryNumber),
                secondNumber,
                thirdNumber);
    }
}
