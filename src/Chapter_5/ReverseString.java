package Chapter_5;


public class ReverseString {
    public static boolean isReverseString(String s) {
        for (int i = 0; i < s.length()/2; i++){
            if (s.charAt(i)!=s.charAt(s.length()-i-1))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s="eeabwwcdcwwbaee";
        if(isReverseString(s)) System.out.println("是回文字符串");
        else System.out.println("不是回文字符串");
    }
}
