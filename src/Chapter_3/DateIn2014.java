package Chapter_3;

public class DateIn2014 {
    public static void getDateIn2014(int month,int day) {
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Wrong Input");
            return;
        }

        int date = 0;

        for (int i = 1; i < month; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                    date += 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    date += 30;
                    break;
                case 2:
                    date += 28;
                    break;
            }
        }
            date += day;
            System.out.println("It's the No." + date + " day in 2014");

    }

    public static void main(String[] args) {
        int month=20,day=3;
        getDateIn2014(month,day);
    }
}
