package JavaSyntax;

import java.util.*;

public class Problem7_RandomizeNumbersN_M {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int firstNumber = console.nextInt();
        int secondNumber = console.nextInt();
        Random random = new Random();
        if(firstNumber > secondNumber){
            int num = secondNumber;
            secondNumber = firstNumber;
            firstNumber = num;
        }
        List<Integer> numbers = new ArrayList<>();
        for (int i = firstNumber; i <= secondNumber; i++) {
        numbers.add(i);
        Collections.shuffle(numbers,random);
        }

        for (int number: numbers) {
        System.out.println(number);
        }
    }
}

