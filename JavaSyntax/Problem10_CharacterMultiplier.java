package JavaSyntax;

import java.util.Scanner;

public class Problem10_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] words = console.nextLine().split(" ");
        int sum = CharMultiplier(words[0], words[1]);
        System.out.println(sum);
    }

    private static int CharMultiplier(String word, String word1) {
        int length = Math.min(word.length(), word1.length());
        int sum = 0;
        for (int i = 0; i < length; i++) {
            sum += (int)word.charAt(i) * (int)word1.charAt(i);
        }
        for (int i = length ; i < word.length(); i++) {
            sum += (int)word.charAt(i);
        }
        for (int i = length ; i < word1.length(); i++) {
            sum += (int)word1.charAt(i);
        }
        return sum;
    }
}
