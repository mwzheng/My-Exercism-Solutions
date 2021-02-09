import java.util.HashSet;

class NaturalNumber {
    private final int naturalNumber;
    private final Classification classification;

    public NaturalNumber(int naturalNumber) {
        this.naturalNumber = naturalNumber;
        this.classification = calculateClassification();
    }

    private Classification calculateClassification() {
        if (naturalNumber <= 0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");

        int currFactor = 1;
        Classification classification;
        HashSet<Integer> factors = new HashSet<>();

        while (currFactor != naturalNumber) {
            if (naturalNumber % currFactor == 0) factors.add(currFactor);
            currFactor++;
        }

        int factorSum = factors.stream().reduce(0, Integer::sum);

        if (factorSum == naturalNumber)
            classification = Classification.PERFECT;
        else if (factorSum < naturalNumber)
            classification = Classification.DEFICIENT;
        else
            classification = Classification.ABUNDANT;

        return classification;
    }

    public Classification getClassification() {
        return classification;
    }
}
