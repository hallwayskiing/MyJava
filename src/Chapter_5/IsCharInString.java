package Chapter_5;

import java.util.Scanner;

public class IsCharInString {
    /*
    返回字符在字符串中的下标，未找到则返回-1
     */
    public static int isCharInString(char ch, String line) {
        int pos = -1;

        for (int i = 0; i < line.length(); i++)
            if (line.charAt(i) == ch)
                pos = i;

        return pos;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.nextLine().charAt(0);
        String line = input.nextLine();
        int ans = isCharInString(ch, line);
        if (ans == -1) System.out.println("Not Found!");
        else System.out.println("Position:" + ans);
    }
}
