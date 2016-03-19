package JavaSyntax;

import java.util.Scanner;

public class Problem4_CalculateExpression {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double firstNumber = console.nextDouble();
        double secondNumber = console.nextDouble();
        double thirdNumber = console.nextDouble();

        double f1 = Math.pow(((firstNumber * firstNumber + secondNumber * secondNumber) / (firstNumber * firstNumber - secondNumber * secondNumber)),
                (firstNumber + secondNumber + thirdNumber) / (Math.sqrt(thirdNumber)));
        System.out.printf("F1 result: %.2f; ", f1);

        double f2 = Math.pow((firstNumber * firstNumber + secondNumber * secondNumber - thirdNumber * thirdNumber * thirdNumber),
                (firstNumber - secondNumber));
        System.out.printf("F2 result: %.2f; ", f2);

        System.out.printf("Diff: %.2f",Math.abs ((firstNumber + secondNumber + thirdNumber) / 3 - ((f1 + f2) / 2)));
    }
}
