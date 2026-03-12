import java.util.HashMap;
import java.util.Map;

public class UC8 {

    // Map to store character patterns
    private static Map<Character, String[]> patternMap = new HashMap<>();

    public static void main(String[] args) {

        initializePatterns();

        String word = "OOPS";

        renderBanner(word);
    }

    // Initialize patterns for characters
    private static void initializePatterns() {

        patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        patternMap.put('S', new String[]{
                " *** ",
                "*    ",
                " *** ",
                "    *",
                " *** "
        });
    }

    // Render banner using nested loops
    private static void renderBanner(String word) {

        int height = 5;

        for (int row = 0; row < height; row++) {

            for (char ch : word.toCharArray()) {

                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[row] + "  ");
                }
            }

            System.out.println();
        }
    }
}