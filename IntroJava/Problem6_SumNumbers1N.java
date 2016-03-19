package IntroJava;

import java.util.Scanner;

public class Problem6_SumNumbers1N {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum +=i;
        }
        System.out.println(sum);
    }
}
