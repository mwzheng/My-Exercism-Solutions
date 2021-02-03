import java.util.HashMap;

class RnaTranscription {
    private static final HashMap<Character, Character> complements = new HashMap<>() {{
        put('C', 'G');
        put('G', 'C');
        put('T', 'A');
        put('A', 'U');
    }};

    String transcribe(String dnaStrand) {
        StringBuilder rna = new StringBuilder();

        if (dnaStrand.isBlank()) return rna.toString();

        char[] dna = dnaStrand.toCharArray();

        for (char aChar : dna)
            rna.append(complements.get(aChar));

        return rna.toString();
    }
}
