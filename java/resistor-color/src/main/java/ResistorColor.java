import java.util.ArrayList;
import java.util.List;

class ResistorColor {
    final ArrayList<String> colorList = new ArrayList<String>(
           List.of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")
    );

    int colorCode(String color) {
        return colorList.indexOf(color);
    }

    String[] colors() {
        return colorList.toArray(new String[0]);
    }
}
