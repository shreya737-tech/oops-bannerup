import java.util.HashMap;
import java.util.Map;

public class BannerUC8 {

    // Function to render the banner
    public static void printBanner(String word, Map<Character, String[]> patterns) {
        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                String[] pattern = patterns.get(c);
                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = new HashMap<>();

        patterns.put('O', new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        });

        patterns.put('P', new String[]{
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*",
            "*",
            "*"
        });

        patterns.put('S', new String[]{
            "*****",
            "*",
            "*",
            "*****",
            "    *",
            "    *",
            "*****"
        });

        String word = "OOPS";

        printBanner(word, patterns);
    }
}