package JavaSyntax;

import java.util.Scanner;

public class Problem9_HitTheTarget {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        for (int i = 1; i <= 20 ; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == number){
                    System.out.printf("%d + %d = %d",i,j,number);
                    System.out.println();
                }
                else if (i - j == number){
                    System.out.printf("%d - %d = %d",i,j,number);
                    System.out.println();
                }
            }
        }
    }
}
