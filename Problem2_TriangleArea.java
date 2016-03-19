package JavaSyntax;

import java.util.Locale;
import java.util.Scanner;

public class Problem2_TriangleArea {
    public static void main(String[] args) {
        //Locale.setDefault(new Locale("BG", "BG"));
        //Locale.setDefault(Locale.Root);
        Scanner console = new Scanner(System.in);

        int aX = console.nextInt();
        int aY = console.nextInt();
        console.nextLine();
        int bX = console.nextInt();
        int bY = console.nextInt();
        console.nextLine();
        int cX = console.nextInt();
        int cY = console.nextInt();
        console.nextLine();
        double area = Math.round(Math.abs((aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2));

        if ((aX == bX && bX == cX) || (aY == bY && bY == cY)) {
            area = 0;
        }

        System.out.printf("%.0f",area);

    }
}
