package JavaSyntax;

import java.util.Scanner;

public class Problem11_GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        //11 6 2 8 1 0
        //Get 8 even
        Scanner console = new Scanner(System.in);
        String[] stringNumbers = console.nextLine().split(" ");
        String[] commands = console.nextLine().split(" ");
        int count = Integer.parseInt(commands[1]);
        int[] numbers = new int[stringNumbers.length];
        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }
        if (commands[2].equals("even")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0 && count >0){
                    System.out.print(numbers[i] + " ");
                    count--;
                }
            }
        }
        else if (commands[2].equals("odd")) {
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0 && count >0){
                    System.out.print(numbers[i] + " ");
                    count--;
                }
            }
        }
    }
}
