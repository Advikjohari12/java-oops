import java.util.HashMap;
import java.util.Map;

class Banner {

    // Map to store character patterns
    private Map<Character, String[]> patterns;

    // Constructor
    public Banner() {
        patterns = new HashMap<>();
        loadPatterns();
    }

    // Load banner patterns into the map
    private void loadPatterns() {

        patterns.put('O', new String[]{
                " ***** ",
                "*     *",
                "*  *  *",
                "*     *",
                " ***** "
        });

        patterns.put('P', new String[]{
                " ***** ",
                "*  *  *",
                " ***** ",
                "*      ",
                "*      "
        });

        patterns.put('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        });
    }

    // Display word in banner format
    public void display(String word) {

        word = word.toUpperCase();

        int height = 5; // Number of rows per character

        for (int i = 0; i < height; i++) {

            for (char ch : word.toCharArray()) {

                if (patterns.containsKey(ch)) {
                    System.out.print(String.join("", patterns.get(ch)[i], "  "));
                } else {
                    System.out.print("        ");
                }

            }

            System.out.println();
        }
    }
}

// Main class
public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Simple output
        System.out.println("OOPS\n");

        // Step 2–5: Banner using class, functions, and map
        Banner banner = new Banner();

        System.out.println("OOPS Banner:\n");
        banner.display("OOPS");
    }
}
