package Chapter_5;

import java.util.Scanner;

public class IsCharInString {
    public static void isCharInString(char ch,String line) {
        int pos = -1;

        for (int i = 0; i < line.length(); i++)
            if (line.charAt(i) == ch)
                pos = i;

        if (pos == -1)
            System.out.println("Not Found!");
        else
            System.out.println("Position:" + pos);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.nextLine().charAt(0);
        String line = input.nextLine();
        isCharInString(ch, line);
    }
}
