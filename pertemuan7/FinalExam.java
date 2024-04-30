public class FinalExam extends GradeActivity {
    private int numberOfQuestion;
    private int numberOfMiss;
    double pointsPerQuestion;

    public FinalExam(int questions, int missed) {
        numberOfQuestion = questions;
        numberOfMiss = missed;
    }

    public double getPointsPerQuestion() {
        return numberOfQuestion * pointsPerQuestion;
    }

    public int getNumberMissed() {
        return numberOfMiss;
    }

}