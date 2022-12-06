package Chapter_3;

public class StudentScore {
    int score;

    StudentScore(int examScore) {
        score = examScore;
    }

    public static void main(String[] args) {
        StudentScore student_a = new StudentScore(44);
        System.out.println(student_a.getExamResult());
    }

    String getExamResult() {
        if (score < 60) return "不合格";
        else return "合格";
    }


}
