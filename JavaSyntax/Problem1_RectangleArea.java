package JavaSyntax;

import java.util.Scanner;

public class Problem1_RectangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] numbers = console.nextLine().split(" ");
        int[] sides = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            sides[i] = Integer.parseInt(numbers[i]);
        }
        int sum = sides[0] * sides[1];
        System.out.println(sum);
    }
}
