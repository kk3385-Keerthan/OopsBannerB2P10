import java.util.HashMap;
import java.util.Map;

public class OopsBannerUC8 {

    // Function to create pattern map
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "*****",
                "*   *",
                "*   *",
                "*   *",
                "*****"
        });

        patternMap.put('P', new String[]{
                "*****",
                "*   *",
                "*****",
                "*",
                "*"
        });

        patternMap.put('S', new String[]{
                "*****",
                "*",
                "*****",
                "    *",
                "*****"
        });

        return patternMap;
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                System.out.print(pattern[i] + "   ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        renderBanner("OOPS", patternMap);
    }
}