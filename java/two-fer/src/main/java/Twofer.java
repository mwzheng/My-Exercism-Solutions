public class Twofer {
    public String twofer(String name) {
        String name1;
        name1 = (name == null) ? "you": name;
        return "One for " + name1 + ", one for me.";
    }
}
