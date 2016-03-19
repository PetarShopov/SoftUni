package JavaSyntax;

import java.util.Scanner;

public class Problem6_FromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String number = console.nextLine();

        String convertedNumber = Integer.toString(Integer.parseInt(number, 7), 10);
        System.out.print(convertedNumber);
    }
}
