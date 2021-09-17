public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter,
    // it is returned unchanged.
    public static char toLower(char ch) {
        char lower=Character.toLowerCase(ch);
        return lower;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not a lowercase letter,
    // it is returned unchanged.
    public static char toUpper(char ch) {
        char upper=Character.toUpperCase(ch);
        return upper;
    }

    // The method is given a String as input and returns a
    // new String where all of the numbers have been removed
    // from the original String.
    public static String removeNumbers(String str) {
       str= str.replaceAll("[0-9]","");
       return str;

    }

    // Write some code to test your methods!
    public static void main(String[] args) {
        System.out.println(removeNumbers("z0ra123"));
        System.out.println(toUpper('G'));
        System.out.println(toLower('G'));
    }
}
