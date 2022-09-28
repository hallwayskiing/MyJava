package Chapter_3;

public class SeasonofMonth {
    public static void judgeSeason(int month)
    {
        switch (month)
        {
            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("wrong input!");
                break;
        }
    }

    public static void main(String[] args) {
        int month=11;
        judgeSeason(month);
    }
}
