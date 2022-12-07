package Chapter_3;

public class ToUpperLetter {
    public static char toUpperLetter(char input) {
        if (input >= 'a' && input <= 'z') {
            int upper = (int) input - 32;//ASCII码中大小写英文字符相差32
            return (char) upper;
        } else return input;

    }

    public static void main(String[] args) {
        char input = 'z';
        System.out.println(toUpperLetter(input));
    }
}
