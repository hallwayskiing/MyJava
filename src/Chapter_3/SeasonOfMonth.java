package Chapter_3;

public class SeasonOfMonth {
    public static String getSeasonOfMonth(int month)
    {
        String season=null;
        switch (month)
        {
            case 3:
            case 4:
            case 5:
                season="春季";
                break;
            case 6:
            case 7:
            case 8:
                season="夏季";
                break;
            case 9:
            case 10:
            case 11:
                season="秋季";
                break;
            case 12:
            case 1:
            case 2:
                season="冬季";
                break;
            default:
                season="Wrong Input!";
                break;
        }
        return season;
    }

    public static void main(String[] args) {
        int month=11;
        System.out.println(getSeasonOfMonth(month));
    }
}
