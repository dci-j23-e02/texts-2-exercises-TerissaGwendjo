// EXERCISE 2
public class ImprovedIsEmpty {
        public static void main(String[] args) {
            String str1 = "";
            String str2 = " ";
            String str3 = " hello ";

            String str4 = "!";


            System.out.println(identify(str1)); // Output: "empty string"
            System.out.println(identify(str2)); // Output: "only whitespaces"
            System.out.println(identify(str3)); // Output: "not empty"
            System.out.println(identify(str4));
        }

        public static String identify(String input) {
            if (input.isEmpty()) {
                return "empty string";
            } else if (input.trim().isEmpty()) {
                return "only whitespaces";
            } else {
                return "not empty";
            }
        }
    }
