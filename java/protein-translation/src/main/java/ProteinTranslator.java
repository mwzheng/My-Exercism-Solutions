import java.util.*;
import java.util.regex.Pattern;

class ProteinTranslator {
    private final HashMap<String, String> nucleotideToCodon = new HashMap<>() {{
        put("AUG", "Methionine");
        put("UUU", "Phenylalanine");
        put("UUC", "Phenylalanine");
        put("UUA", "Leucine");
        put("UUG", "Leucine");
        put("UCU", "Serine");
        put("UCC", "Serine");
        put("UCA", "Serine");
        put("UCG", "Serine");
        put("UAU", "Tyrosine");
        put("UAC", "Tyrosine");
        put("UGU", "Cysteine");
        put("UGC", "Cysteine");
        put("UGG", "Tryptophan");
    }};

    List<String> translate(String rnaSequence) {
        int sequenceLength = rnaSequence.length();
        List<String> polypeptide = new ArrayList<>();
        String codon, rna;

        for (int i = 0; i < sequenceLength; i += 3) {
            String nucleotide = rnaSequence.substring(i, i + 3);
            codon = nucleotideToCodon.get(nucleotide);
            if (codon == null) break;
            polypeptide.add(codon);
        }

        return polypeptide;
    }
}
