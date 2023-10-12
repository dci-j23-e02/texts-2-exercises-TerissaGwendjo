// EXERCISE 3

public class Inator{
    public static void main(String[] args) {
        System.out.println(inator("Shrink")); // Output: "Shrinkinator 6000"
        System.out.println(inator("Doom"));   // Output: "Doominator 4000"
        System.out.println(inator("EvilClone"));// Output: "EvilClone-inator 9000"
        System.out.println(inator(""));
    }

    public static String inator(String word) {
        // Define a string of consonants
        String consonants = "bcdfghjklmnpqrstvwxyz";

        if (word.length() == 0) {
            return "inator 0000"; // Handle empty input separately
        }

        char lastChar = word.charAt(word.length() - 1);

        if (consonants.contains(String.valueOf(lastChar).toLowerCase())) {
            return word + "inator " + word.length() + "000";
        } else {
            return word + "-inator " + word.length() + "000";
        }
    }
}
