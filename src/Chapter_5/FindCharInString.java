package Chapter_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindCharInString {
    /*
    返回字符在字符串中的下标，未找到则返回空。
     */
    public static List<Integer> findCharInString(String line,char ch) {
        List<Integer>ans=new ArrayList<>();

        for (int i = 0; i < line.length(); i++)
            if (line.charAt(i) == ch)
                ans.add(i);

        return ans;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line = input.nextLine();
        char ch = input.nextLine().charAt(0);
        List<Integer> ans = findCharInString(line,ch);
        if (ans.isEmpty()) System.out.println("Not Found!");
        else System.out.println("Position:" + ans);
    }
}
