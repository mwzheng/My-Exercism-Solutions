class Acronym {
    private final String acronym;

    Acronym(String phrase) {
        StringBuilder acronym = new StringBuilder();
        phrase = phrase.replaceAll("[-_]", " ");
        String[] words = phrase.split(" ");

        for (String aWord : words) {
            if (!aWord.isEmpty()) {
                char firstCharToUpperCase = Character.toUpperCase(aWord.charAt(0));
                acronym.append(firstCharToUpperCase);
            }
        }

        this.acronym = acronym.toString();
    }

    String get() {
        return acronym;
    }
}
