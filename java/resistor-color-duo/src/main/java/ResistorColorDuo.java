import java.util.ArrayList;
import java.util.List;

class ResistorColorDuo {
    private static final ArrayList<String> colorList = new ArrayList<String>(
            List.of("black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white")
    );

    int value(String[] colors) {
        StringBuilder resistanceValue = new StringBuilder();

        for (String aColor : colors) {
            if (resistanceValue.length() == 2) break;
            resistanceValue.append(colorList.indexOf(aColor));
        }

        return Integer.parseInt(resistanceValue.toString());
    }
}
