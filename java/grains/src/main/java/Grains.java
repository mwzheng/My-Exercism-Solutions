import java.math.BigInteger;
import java.util.HashMap;

class Grains {
    BigInteger grainsOnSquare(final int square) {
        if (square <= 0 || square > 64)
            throw new IllegalArgumentException("square must be between 1 and 64");

        BigInteger grains = new BigInteger(String.valueOf(2));
        return grains.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
        BigInteger sum = new BigInteger("0");

        for (int i = 1; i < 65; i++)
            sum = sum.add(grainsOnSquare(i));

        return sum;
    }
}
