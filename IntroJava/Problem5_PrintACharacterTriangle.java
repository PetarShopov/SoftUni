package IntroJava;

import java.util.Scanner;

public class Problem5_PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i < number ; i++) {
            for (int j = 97; j < 97 + i ; j++) {
                System.out.print((char)j);
                System.out.print(' ');
            }
            System.out.println();
        }
        for (int i = number; i > 0 ; i--) {
            for (int j = 97; j < 97 + i ; j++) {
                System.out.print((char)j);
                System.out.print(' ');
            }
            System.out.println();
        }
    }
}
