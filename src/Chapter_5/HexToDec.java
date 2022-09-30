package Chapter_5;

import java.util.Scanner;

public class HexToDec {
    static int hexToDec(String hex) {
        int dec = 0;
        int times = 1;
        for (int i = hex.length() - 1; i >= 0; i--) {
            char ch = Character.toLowerCase(hex.charAt(i));
            if ('0' <= ch && ch <= '9')
                dec += (ch - '0') * times;
            else if ('a' <= ch && ch <= 'f')
                dec += (ch - 'a' + 10) * times;
            times *= 16;
        }
        return dec;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print(hexToDec(input.nextLine()));
    }
}
