package JavaSyntax;

import java.util.Scanner;

public class Problem8_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] numbers = console.nextLine().split(" ");
        int[] integerNums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            integerNums[i] = Integer.parseInt(numbers[i]);
        }
        if (integerNums.length % 2 == 1) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < integerNums.length - 1; i = i + 2) {
                if (integerNums[i] % 2 == 0 && integerNums[i + 1] % 2 == 0) {
                    System.out.printf("%d, %d -> both are even", integerNums[i], integerNums[i + 1]);
                    System.out.println();
                } else if (integerNums[i] % 2 != 0 && integerNums[i + 1] % 2 != 0) {
                    System.out.printf("%d, %d -> both are odd", integerNums[i], integerNums[i + 1]);
                    System.out.println();
                } else {
                    System.out.printf("%d, %d -> different", integerNums[i], integerNums[i + 1]);
                    System.out.println();
                }
            }
        }
    }
}
