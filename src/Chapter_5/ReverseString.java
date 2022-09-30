package Chapter_5;

import java.util.Stack;

public class ReverseString {
    public static boolean isReverseString(String s) {
        Stack<Character> reversed = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            reversed.push(ch);
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!reversed.pop().equals(ch))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s="eeabcdcbaee";
        if(isReverseString(s)) System.out.println("是回文字符串");
        else System.out.println("不是回文字符串");
    }
}
