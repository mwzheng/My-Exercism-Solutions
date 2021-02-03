import java.util.Arrays;

class DnDCharacter {
    private final int strength;
    private final int constitution;
    private final int intelligence;
    private final int wisdom;
    private final int charisma;
    private final int hitpoints;
    private final int dexterity;

    public DnDCharacter() {
        this.constitution = ability();
        this.strength = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
        this.dexterity = ability();
        this.hitpoints = modifier(constitution) + 10;
    }

    private static int rollDice() {
        return (int) Math.floor((Math.random() * 6) + 1);
    }

    int ability() {
        int[] rolls = new int[4];

        for (int i = 0; i < 4; i++)
            rolls[i] = rollDice();

        Arrays.sort(rolls);
        return Arrays.stream(rolls).limit(3).sum();
    }

    int modifier(int input) {
        double temp = ((double) (input - 10) / 2);
        return (int) Math.floor(temp);
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return this.hitpoints;
    }

}
