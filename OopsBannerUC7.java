public class OopsBannerUC7 {

    // Static Inner Class to store character and its pattern
    static class CharacterPattern {
        char character;
        String[] pattern;

        // Constructor
        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for pattern
        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create character patterns
        CharacterPattern O = new CharacterPattern('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "*****",
                "*   *",
                "*****",
                "*",
                "*"
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                "*****",
                "*",
                "*****",
                "    *",
                "*****"
        });

        String[] patternO = O.getPattern();
        String[] patternP = P.getPattern();
        String[] patternS = S.getPattern();

        // Print OOPS banner
        for (int i = 0; i < patternO.length; i++) {
            System.out.println(patternO[i] + "   " + patternO[i] + "   " + patternP[i] + "   " + patternS[i]);
        }
    }
}
