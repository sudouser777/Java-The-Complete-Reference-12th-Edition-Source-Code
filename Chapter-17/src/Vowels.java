// Use a switch expression to determine if a character is an English vowel.
// Notice the use of a block as the target of an arrow case for Y.

class Vowels {

    public static void main(String[] args) {

        // If Y is to be counted as a vowel, set this
        // variable to true.
        boolean yIsVowel = true;

        char ch = 'Y';

        boolean isVowel = switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> true;
            case 'y', 'Y' -> {
                if (yIsVowel) yield true;
                else yield false;
            }
            default -> false;
        };

        if (isVowel) System.out.println(ch + " is a vowel.");
    }
}