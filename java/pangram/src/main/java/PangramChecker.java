import java.util.Arrays;
import java.util.HashSet;

public class PangramChecker {
    private final int totalUniqueLetters = 26;

    public boolean isPangram(String input) {
        HashSet<Character> letterSet = new HashSet<>();
        char[] letters = input.toCharArray();

        for (char aChar : letters)
            if (Character.isLetter(aChar))
                letterSet.add(Character.toLowerCase(aChar));

        return letterSet.size() == totalUniqueLetters;
    }
}
