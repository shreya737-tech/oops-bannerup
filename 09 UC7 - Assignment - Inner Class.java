public class BannerUC7 {

    // Static Inner Class
    static class CharacterPattern {
        char character;
        String[] pattern;

        CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
            "*****",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*****"
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
            "*****",
            "*   *",
            "*   *",
            "*****",
            "*",
            "*",
            "*"
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
            "*****",
            "*",
            "*",
            "*****",
            "    *",
            "    *",
            "*****"
        });

        String word = "OOPS";

        for (int i = 0; i < 7; i++) {
            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {
                if (c == 'O') line.append(O.getPattern()[i]).append("  ");
                if (c == 'P') line.append(P.getPattern()[i]).append("  ");
                if (c == 'S') line.append(S.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}