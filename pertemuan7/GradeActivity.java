public class GradeActivity {
    private double score;
    privat String name;

    public GradeActivity(){

    public GradeActivity(String n) {
        name = n;
    }

    public void setScore(double s) {
        score = s;
    }

    public double getScore(double s) {
        return score;
    }

    public char getGrade() {
        if (score >= 70)
            return 'A';
        else
            return 'E';
    }
}}
