import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

class Scrabble {
    private final static String onePtChars = "[AEIOULNRST]";
    private final static String twoPtChars = "[DG]";
    private final static String threePtChars = "[BCMP]";
    private final static String fourPtChars = "[FHVWY]";
    private final static String fivePtChars = "[K]";
    private final static String eightPtChars = "[JX]";
    private final static String tenPtChars = "[QZ]";

    private static final HashMap<String, Integer> ptMap = new HashMap<>() {{
        put(onePtChars, 1);
        put(twoPtChars, 2);
        put(threePtChars, 3);
        put(fourPtChars, 4);
        put(fivePtChars, 5);
        put(eightPtChars, 8);
        put(tenPtChars, 10);
    }};

    private final int score;

    Scrabble(String word) {
        String currWord = word.toUpperCase(Locale.ROOT);
        int currWordLength = word.length();
        int score = 0;

        // At each iteration take out all chars in the given pt category
        // Then calculate score using the change in remaining word length
        for (Map.Entry<String, Integer> entry : ptMap.entrySet()) {
            if (currWord.isEmpty()) break;
            currWord = currWord.replaceAll(entry.getKey(), "");
            int lengthDiff = currWordLength - currWord.length();
            score += (entry.getValue() * lengthDiff);
            currWordLength = currWord.length();
        }

        this.score = score;
    }

    int getScore() {
        return score;
    }
}
