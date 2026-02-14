import java.util.HashMap;
import java.util.Map;

class Banner {

    private Map<Character, String[]> patterns;

    public Banner() {
        patterns = new HashMap<>();
        loadPatterns();
    }

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

    public void display(String word) {

        word = word.toUpperCase();

        int height = 5; 

        for (int i = 0; i < height; i++) {

            for (char ch : word.toCharArray()) {

                if (patterns.containsKey(ch)) {
                    System.out.print(patterns.get(ch)[i] + "  ");
                } else {
                    System.out.print("        ");
                }

            }

            System.out.println();
        }
    }
}

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println("OOPS\n");

        Banner banner = new Banner();

        System.out.println("OOPS Banner:\n");
        banner.display("OOPS");
    }
}
