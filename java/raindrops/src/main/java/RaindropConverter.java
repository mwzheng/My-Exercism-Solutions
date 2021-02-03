class RaindropConverter {

    String convert(int number) {
        StringBuilder result = new StringBuilder();
        boolean isFactorOf3 = number % 3 == 0;
        boolean isFactorOf5 = number % 5 == 0;
        boolean isFactorOf7 = number % 7 == 0;

        if (isFactorOf3) result.append("Pling");
        if (isFactorOf5) result.append("Plang");
        if (isFactorOf7) result.append("Plong");

        return (result.toString().isEmpty()) ? "" + number : result.toString();
    }

}
