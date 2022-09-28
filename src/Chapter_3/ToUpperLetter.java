package Chapter_3;

public class ToUpperLetter {
    public static char toUpperLetter(char input)
    {
        switch(input) {
            case 'a':
                input = 'A';
                break;
            case 'b':
                input = 'B';
                break;
            case 'c':
                input = 'C';
                break;
            case 'd':
                input = 'D';
                break;
            case 'e':
                input = 'E';
                break;
            default:
                System.out.print("other");
                break;
        }
        return input;
    }
    public static void main(String[] args) {
        char input='a';
        System.out.println(toUpperLetter(input));
    }
}
