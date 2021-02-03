class Leap {
    boolean isLeapYear(int year) {
        boolean isDivisibleByFour = (year % 4 == 0);
        boolean isDivisibleByAHundred = (year % 100 == 0);
        boolean isDivisibleByFourHundred = (year % 400 == 0);

       if (isDivisibleByFour)
           return !isDivisibleByAHundred || isDivisibleByFourHundred;

       return false;
    }
}
