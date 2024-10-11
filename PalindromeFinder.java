package first_laba;
import java.util.ArrayList;
import java.util.List;

public class PalindromeFinder {
    public static List<String> findPalindromes(String sentence) {
        List<String> palindromes = new ArrayList<>();
        String[] words = sentence.toLowerCase().split("\\s+"); // Разбиваем предложение на слова

        for (String word : words) {
            if (isPalindrome(word)) {
                palindromes.add(word);
            }
        }

        return palindromes;
    }

    public static boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equals(reversedWord);
    }
}
