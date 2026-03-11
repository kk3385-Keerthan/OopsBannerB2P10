public class OopsBannerUC6 {

    // Method to generate letter O
    public static String[] letterO() {
        return new String[]{
                String.join("", "*","*","*","*","*"),
                String.join("", "*","     ","*"),
                String.join("", "*","     ","*"),
                String.join("", "*","     ","*"),
                String.join("", "*","*","*","*","*")
        };
    }

    // Method to generate letter P
    public static String[] letterP() {
        return new String[]{
                String.join("", "*","*","*","*","*"),
                String.join("", "*","     ","*"),
                String.join("", "*","*","*","*","*"),
                String.join("", "*"),
                String.join("", "*")
        };
    }

    // Method to generate letter S
    public static String[] letterS() {
        return new String[]{
                String.join("", "*","*","*","*","*"),
                String.join("", "*"),
                String.join("", "*","*","*","*","*"),
                String.join("", "     ","*"),
                String.join("", "*","*","*","*","*")
        };
    }

    public static void main(String[] args) {

        String[] O = letterO();
        String[] P = letterP();
        String[] S = letterS();

        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "   " + O[i] + "   " + P[i] + "   " + S[i]);
        }
    }
}