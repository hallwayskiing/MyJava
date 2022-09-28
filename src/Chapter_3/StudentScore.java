package Chapter_3;

public class StudentScore {
    int score;

    StudentScore(int examScore) {
        score = examScore;
    }

    public static void main(String[] args) {
        StudentScore student_a = new StudentScore(44);
        student_a.showResult();
    }

    void showResult() {
        if (score < 60) System.out.println("不合格");
        else System.out.println("合格");
    }
}
