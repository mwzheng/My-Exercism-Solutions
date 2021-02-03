class ReverseString {

    String reverse(String inputString) {
        if (inputString.equals("")) return "";

        char[] charArray = inputString.toCharArray();
        StringBuilder reverse = new StringBuilder();

        for (char aChar : charArray)
            reverse.insert(0, aChar);

        return reverse.toString();
    }
  
}
