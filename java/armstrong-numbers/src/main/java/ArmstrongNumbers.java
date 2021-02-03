class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        String[] stringOfInt = String.valueOf(numberToCheck).split("");
        int numbOfDigits = stringOfInt.length;
        int sumOfDigits = 0;

        for (String s : stringOfInt) {
            int currDigit = Integer.parseInt(s);
            sumOfDigits += Math.pow(currDigit, numbOfDigits);
        }

        return sumOfDigits == numberToCheck;
    }

}
