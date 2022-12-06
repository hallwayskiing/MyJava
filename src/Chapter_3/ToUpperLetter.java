package Chapter_3;

public class ToUpperLetter {
    public static char toUpperLetter(char input) {
        if (input >= 'a' && input <= 'z') {
            int upper = (int) input - 32;
            return (char) upper;
        } else {
            return '0';
        }
    }

    public static void main(String[] args) {
        char input = 'Y';
        System.out.println(toUpperLetter(input));
    }
}
