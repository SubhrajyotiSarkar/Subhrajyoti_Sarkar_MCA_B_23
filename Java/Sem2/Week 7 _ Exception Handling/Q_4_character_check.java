public class Q_4_character_check {
    private int totalAlphabeticCharacters;

    public Q_4_character_check() {
        this.totalAlphabeticCharacters = 0;
    }

    public void addCharacter(char c) throws IllegalArgumentException {
        if (!Character.isLetter(c)) {
            throw new IllegalArgumentException("Non-alphabetic character passed: " + c);
        }
        totalAlphabeticCharacters++;
    }

    public int getTotalAlphabeticCharacters() {
        return totalAlphabeticCharacters;
    }

    // Example usage
    public static void main(String[] args) {
        Q_4_character_check counter = new Q_4_character_check();
        try {
            counter.addCharacter('a');
            counter.addCharacter('b');
            counter.addCharacter('1');
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Total alphabetic characters: " + counter.getTotalAlphabeticCharacters());
    }
}