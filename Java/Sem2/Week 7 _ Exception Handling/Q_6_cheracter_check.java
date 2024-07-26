class CharacterCounter {
    private int totalCount;

    CharacterCounter() {
        this.totalCount = 0;
    }

    public void countCharacter(char c) throws Exception {
        if (!Character.isAlphabetic(c)) {
            throw new Exception("Non-alphabetic character encountered: " + c);
        }
        totalCount++;
    }

    public int getTotalCount() {
        return totalCount;
    }
}

public class Q_6_cheracter_check {
    public static void main(String[] args) {
        CharacterCounter counter = new CharacterCounter();
        String input = "Ayush Dey 0970";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            try {
                counter.countCharacter(c);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        System.out.println("Total count of alphabetic characters: " + counter.getTotalCount());
    }
}
