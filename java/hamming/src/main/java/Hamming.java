public class Hamming {
    private final String leftStrand;
    private final String rightStrand;
    private final int hamming;

    public Hamming(String leftStrand, String rightStrand) {
        if (!(leftStrand.isEmpty() && rightStrand.isEmpty())) {
            if (leftStrand.isEmpty())
                throw new IllegalArgumentException("left strand must not be empty.");

            if (rightStrand.isEmpty())
                throw new IllegalArgumentException("right strand must not be empty.");
        }

        if (leftStrand.length() != rightStrand.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        this.hamming = calculateHammingDist();
    }

    private int calculateHammingDist() {
        int strandLength = leftStrand.length();
        int differences = 0;

        if (!leftStrand.equals(rightStrand))
            for (int i = 0; i < strandLength; i++)
                if (leftStrand.charAt(i) != rightStrand.charAt(i))
                    differences++;

        return differences;
    }

    public int getHammingDistance() {
        return this.hamming;
    }
}
