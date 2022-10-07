package Chapter_6;

import java.util.ArrayList;
import java.util.Scanner;

public class CountPrimes1 {
    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number:");
        int n = input.nextInt();
        if (n <= 2) {
            System.out.println("Not a primie");
            return;
        } else {
            for (int i = 2; i < n; i++) {
                boolean flag = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    res.add(i);
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n" + n + "之内有" + res.size() + "个质数");
        }
    }
}
