package Chapter_3;

public class NarcissisticNumber {
    public static void main(String[] args) {
        //遍历100到999
        for (int i = 100; i < 1000; i++) {
            int hundred = i / 100;//获取百位
            int ten = i / 10 % 10;//获取十位
            int single = i % 10;//获取个位
            if (i == hundred * hundred * hundred + ten * ten * ten + single * single * single)
                System.out.println(i);
        }
    }
}
